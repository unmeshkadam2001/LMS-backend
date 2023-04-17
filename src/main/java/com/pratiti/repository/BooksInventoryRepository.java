package com.pratiti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratiti.entity.BooksInventory;

@Repository
public interface BooksInventoryRepository extends JpaRepository<BooksInventory, String> {

}
