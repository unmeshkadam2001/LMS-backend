package com.pratiti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pratiti.entity.BooksInventory;
import com.pratiti.service.ManagerServices;

@RestController
@CrossOrigin
public class ManagerController {

	@Autowired
	private ManagerServices managerServices;

	@PostMapping("/save-book")
	public String saveBook(@RequestBody BooksInventory booksInventory) {
		managerServices.saveBook(booksInventory);
		return "Book added successfully!";
	}
}
