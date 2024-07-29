package com.hamed.pat.letter;

import com.hamed.pat.dtos.LetterDto;
import com.hamed.pat.service.letter.InsertLetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class InsertLetterTest {
    InsertLetter insertLetter;
    @BeforeEach
    void setup(){
        insertLetter = new InsertLetter();
    }
    @Test
    public void insertLetter()
    {
        System.out.println(insertLetter.insertLetter(LetterDto.builder().build()));
    }
}
