package com.hamed.pat.repository;

import com.hamed.pat.model.Secretariat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretariatRepository extends JpaRepository<Secretariat, Long> {
}