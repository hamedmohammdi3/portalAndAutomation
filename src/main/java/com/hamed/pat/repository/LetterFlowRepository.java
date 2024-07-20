package com.hamed.pat.repository;

import com.hamed.pat.model.LetterFlow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LetterFlowRepository extends JpaRepository<LetterFlow, Long> {
}