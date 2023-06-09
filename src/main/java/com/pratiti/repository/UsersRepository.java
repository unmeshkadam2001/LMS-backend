package com.pratiti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratiti.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

	Users findByUserName(String username);
}
