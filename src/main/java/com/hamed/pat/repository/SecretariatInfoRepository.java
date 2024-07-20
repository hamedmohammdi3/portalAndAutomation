package com.hamed.pat.repository;

import com.hamed.pat.model.SecretariatInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretariatInfoRepository extends JpaRepository<SecretariatInfo, Long> {
}