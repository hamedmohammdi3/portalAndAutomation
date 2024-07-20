package com.hamed.pat.repository;

import com.hamed.pat.model.SecretAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretAttachmentRepository extends JpaRepository<SecretAttachment, Long> {
}