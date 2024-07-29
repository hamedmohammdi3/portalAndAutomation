package com.hamed.pat.controller;

import com.hamed.pat.dtos.LetterDto;

import com.hamed.pat.mapper.LetterMapper;

import com.hamed.pat.repository.LetterRepository;


import com.hamed.pat.service.letter.LetterBusiness;
import com.hamed.pat.validation.LetterValidation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/")
public class GenerateLetterController {

    @Autowired
    LetterBusiness letterBusiness;
    @PostMapping("/letter")
    public ResponseEntity<?> insertLetter(@Valid @RequestBody LetterDto letterDto){
        return letterBusiness.insertLetter(letterDto);
    }

    @GetMapping("/letter/{letter-id}")
    public ResponseEntity<?> getLetterById(@Valid @PathVariable("letter-id") Long id){
       return letterBusiness.fetchLetterById(id);
    }
    @PutMapping("/letter")
    public ResponseEntity<?> updateLetter(@Valid @RequestBody LetterDto letterDto){
        return letterBusiness.updateLetter(letterDto);
    }
    @DeleteMapping("/letter/{letter-id}")
    public ResponseEntity<?> deleteLetterById(@Valid @PathVariable("letter-id") Long id){
        return letterBusiness.deleteLetterById(id);
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
