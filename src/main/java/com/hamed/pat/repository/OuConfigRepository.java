package com.hamed.pat.repository;

import com.hamed.pat.model.OuConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OuConfigRepository extends JpaRepository<OuConfig, Long> {
}