package com.pratiti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratiti.entity.BooksInventory;
import com.pratiti.repository.BooksInventoryRepository;
import com.pratiti.repository.UsersRepository;

@Service
public class ManagerServices {
	@Autowired
	private BooksInventoryRepository booksInventoryRepository;

	public void saveBook(BooksInventory booksInventory) {
		booksInventoryRepository.save(booksInventory);
	}

}
