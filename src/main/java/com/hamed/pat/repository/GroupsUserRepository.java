package com.hamed.pat.repository;

import com.hamed.pat.model.GroupsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsUserRepository extends JpaRepository<GroupsUser, Long> {
}