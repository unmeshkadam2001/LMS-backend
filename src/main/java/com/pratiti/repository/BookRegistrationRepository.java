package com.pratiti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratiti.entity.BookRegistration;

@Repository
public interface BookRegistrationRepository extends JpaRepository<BookRegistration, String> {

}
