package com.pratiti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratiti.entity.BookTransaction;

@Repository
public interface BookTransactionRepository extends JpaRepository<BookTransaction, String> {

}
