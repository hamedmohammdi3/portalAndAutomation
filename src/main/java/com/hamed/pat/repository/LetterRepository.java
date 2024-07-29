package com.hamed.pat.repository;

import com.hamed.pat.model.Letter;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface LetterRepository extends JpaRepository<Letter, Long> {
}