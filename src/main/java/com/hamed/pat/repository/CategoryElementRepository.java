package com.hamed.pat.repository;

import com.hamed.pat.model.CategoryElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryElementRepository extends JpaRepository<CategoryElement, Long> {
}