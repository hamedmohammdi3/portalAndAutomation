package com.hamed.pat.service.letter;

import com.hamed.pat.dtos.LetterDto;
import com.hamed.pat.mapper.Mapper;
import com.hamed.pat.model.Letter;
import com.hamed.pat.repository.LetterRepository;
import com.hamed.pat.util.MessageEnum;
import com.hamed.pat.validation.LetterValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LetterBusiness {
    @Autowired
    Mapper<LetterDto, Letter> letterMapper;
    @Autowired
    LetterValidation letterValidation;
    @Autowired
    LetterRepository letterRepository;

    ResponseEntity<?> responseNotFondEntity = new ResponseEntity<>(MessageEnum.LETTER_NOT_FOND.value(), HttpStatus.NOT_FOUND);

    public ResponseEntity<?> insertLetter(LetterDto letterDto) {
        Letter save = saveAndUpdateLetter(letterDto);
        LetterDto newLetterDto = letterMapper.entityToDto(save);
        return new ResponseEntity<>(newLetterDto, HttpStatus.CREATED);
    }


    public ResponseEntity<?> fetchLetterById(Long id) {
        Letter letter = getLetter(id);
        if (letter == null) {
            return responseNotFondEntity;
        }
        LetterDto letterDto = letterMapper.entityToDto(letter);
        return new ResponseEntity<>(letterDto, HttpStatus.FOUND);
    }



    public ResponseEntity<?> updateLetter(LetterDto letterDto) {
        Letter letter = getLetter(letterDto.id());
        if (letter == null) {
            return responseNotFondEntity;
        }
        LetterDto newLetterDto = letterMapper.entityToDto(letter);
        return new ResponseEntity<>(newLetterDto, HttpStatus.CREATED);

    }

    public ResponseEntity<?> deleteLetterById(Long id) {
        Letter letter = getLetter(id);
        if (letter == null) {
            return responseNotFondEntity;
        }
        letterRepository.delete(letter);
        return new ResponseEntity<>(MessageEnum.LETTER_DELETED_SUCCESSFUL.value(),HttpStatus.OK);
    }

    private Letter saveAndUpdateLetter(LetterDto letterDto) {
        Letter letter = letterMapper.dtoToEntity(letterDto);
        return letterRepository.save(letter);
    }

    private Letter getLetter(Long id) {
        if (id == null) {
            return null;
        }
        Optional<Letter> opLetter = letterRepository.findById(id);
        return opLetter.orElse(null);
    }
}
