package com.hamed.pat.controller;

import com.hamed.pat.dtos.LetterDto;

import com.hamed.pat.mapper.LetterMapper;
import com.hamed.pat.model.Letter;
import com.hamed.pat.repository.LetterRepository;
import com.hamed.pat.service.letter.InsertLetter;

import com.hamed.pat.validation.LetterValidation;
import jakarta.validation.Valid;
import jakarta.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class GenerateLetterController {

    @Autowired
    private InsertLetter insertLetter;
    @Autowired
    private LetterRepository letterRepository;
    @Autowired
    private LetterMapper letterMapper;

    @Autowired
    private LetterValidation letterValidation;
    @PostMapping("/insertLetter")
    public ResponseEntity<?> insertLetter(@Valid @RequestBody LetterDto letterDto){
        letterValidation.LetterInsertValidate(letterDto);
        Letter letter = letterMapper.dtoToEntity(letterDto);
        letterRepository.save(letter);
        return new ResponseEntity<>(letter.getId(),HttpStatus.CREATED);
    }

    @GetMapping("/getLetterById/{letter-id}")
    public ResponseEntity<?> getLetterById(@PathVariable("letter-id") Long id){
        if(id == null){
            return new ResponseEntity <>("Id not Be Null!!",HttpStatus.BAD_REQUEST);
        }
        Optional<Letter> opLetter = letterRepository.findById(id);
        if (opLetter.isEmpty()){
            return new ResponseEntity<>("Letter with id="+id+" notFound!!",HttpStatus.NOT_FOUND);
        }
        LetterDto letterDto = letterMapper.entityToDto(opLetter.get());

        return new ResponseEntity<>(letterDto,HttpStatus.FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handlerMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        var errors = new HashMap<String,String>();
        exception.getBindingResult().getAllErrors()
                .forEach(objectError -> {
                    var fieldName = ((FieldError)objectError).getField();
                    var errorMessage = objectError.getDefaultMessage();
                    errors.put(fieldName,errorMessage);
                });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
