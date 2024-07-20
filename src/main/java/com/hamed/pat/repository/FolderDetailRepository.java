package com.hamed.pat.repository;

import com.hamed.pat.model.FolderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderDetailRepository extends JpaRepository<FolderDetail, Long> {
}