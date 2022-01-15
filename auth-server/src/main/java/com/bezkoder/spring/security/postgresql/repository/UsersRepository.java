package com.bezkoder.spring.security.postgresql.repository;

import com.bezkoder.spring.security.postgresql.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

}

