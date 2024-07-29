package com.hamed.pat;

import com.hamed.pat.model.Letter;
import com.hamed.pat.repository.LetterRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatApplicationTests {

        @Mock
        LetterRepository letterRepository;

    @Test
    void contextLoads() {
        letterRepository.findAll();

    }

}
