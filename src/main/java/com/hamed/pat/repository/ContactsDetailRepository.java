package com.hamed.pat.repository;

import com.hamed.pat.model.ContactsDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsDetailRepository extends JpaRepository<ContactsDetail, Long> {
}