package com.pratiti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class BooksInventory {

	@Id
	private String bookId;
	private String bookName;
	private String author1;
	private String author2;
	private String publisher;
	private String yearOfPublication;

	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private Set<BookRegistration> bookRegistrations;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor1() {
		return author1;
	}

	public void setAuthor1(String author1) {
		this.author1 = author1;
	}

	public String getAuthor2() {
		return author2;
	}

	public void setAuthor2(String author2) {
		this.author2 = author2;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public Set<BookRegistration> getBookRegistrations() {
		return bookRegistrations;
	}

	public void setBookRegistrations(Set<BookRegistration> bookRegistrations) {
		this.bookRegistrations = bookRegistrations;
	}

}
