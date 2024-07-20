package com.hamed.pat.controller;

import com.hamed.pat.dtos.LetterDto;
import com.hamed.pat.model.Letter;
import com.hamed.pat.service.letter.InsertLetter;
import com.hamed.pat.validation.LetterValidation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GenerateLetterController {
    private InsertLetter insertLetter;


    @PostMapping("/insertLetter")
    public String insertLetter(@RequestBody LetterDto letterDto){
/*
            return insertLetter.insertLetter(letterDto);
*/
return null;
    }
}
