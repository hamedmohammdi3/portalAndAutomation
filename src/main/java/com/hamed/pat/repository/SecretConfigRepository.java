package com.hamed.pat.repository;

import com.hamed.pat.model.SecretConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretConfigRepository extends JpaRepository<SecretConfig, Long> {
}