package com.hamed.pat.service.letter;

import com.hamed.pat.dtos.LetterDto;

import com.hamed.pat.mapper.Mapper;
import com.hamed.pat.model.Letter;
import com.hamed.pat.repository.LetterRepository;
import com.hamed.pat.validation.LetterValidation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertLetter {
    @Autowired
    Mapper<LetterDto, Letter> letterMapper;
    @Autowired
    LetterValidation letterValidation;
    @Autowired
    LetterRepository letterRepository;
    public Long insertLetter(LetterDto letterDto){
        letterValidation.LetterInsertValidate(letterDto);
        Letter letter = letterMapper.dtoToEntity(letterDto);
        Letter save = letterRepository.save(letter);
        return save.getId();
    }
}
