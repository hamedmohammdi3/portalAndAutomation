package com.hamed.pat;

import com.hamed.pat.service.letter.InsertLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatApplication.class, args);
    }

}
