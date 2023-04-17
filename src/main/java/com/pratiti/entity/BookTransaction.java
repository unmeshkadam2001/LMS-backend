package com.pratiti.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BookTransaction {

	@Id
	private String transactionId;

	@OneToOne
	private BookRegistration bookRegistration;

	private Date issueDate;
	private Date returnDate;
	private int fine;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public BookRegistration getBookRegistration() {
		return bookRegistration;
	}

	public void setBookRegistration(BookRegistration bookRegistration) {
		this.bookRegistration = bookRegistration;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

}
