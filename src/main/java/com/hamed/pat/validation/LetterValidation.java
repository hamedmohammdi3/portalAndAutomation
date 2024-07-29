package com.hamed.pat.validation;

import com.hamed.pat.dtos.LetterDto;
import jakarta.validation.Valid;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

@Component
public class LetterValidation {


    public void LetterInsertValidate(@Valid LetterDto letterDto) {
        System.out.println("hello valid");
    }

}
