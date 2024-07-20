package com.hamed.pat.repository;

import com.hamed.pat.model.ReservedNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedNumberRepository extends JpaRepository<ReservedNumber, Long> {
}