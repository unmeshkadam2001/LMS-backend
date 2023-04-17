package com.pratiti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Users {

	@Id
	private String userId;
	private String userName;
	private String password;
	private String emailId;
	private Boolean librarian;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<BookRegistration> bookRegistrations;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Boolean getLibrarian() {
		return librarian;
	}

	public void setLibrarian(Boolean librarian) {
		this.librarian = librarian;
	}

	public Set<BookRegistration> getBookRegistrations() {
		return bookRegistrations;
	}

	public void setBookRegistrations(Set<BookRegistration> bookRegistrations) {
		this.bookRegistrations = bookRegistrations;
	}

}
