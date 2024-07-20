package com.hamed.pat.repository;

import com.hamed.pat.model.SecretariatUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretariatUserRepository extends JpaRepository<SecretariatUser, Long> {
}