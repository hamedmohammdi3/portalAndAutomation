package com.hamed.pat.validation;

import com.hamed.pat.dtos.LetterDto;
import com.hamed.pat.model.Letter;
import com.hamed.pat.repository.LetterRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Optional;

@Component
public class LetterValidation {

    @Autowired
    private LetterRepository letterRepository;
    public void LetterInsertValidate(@Valid LetterDto letterDto) {
        System.out.println("hello valid");
    }


}
