package com.hamed.pat.repository;

import com.hamed.pat.model.RelatedLetter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatedLetterRepository extends JpaRepository<RelatedLetter, Long> {
}