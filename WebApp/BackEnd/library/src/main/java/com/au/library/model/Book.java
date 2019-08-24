package com.au.library.model;

public class Book {
	private String id;
	private String bookName;
	private String authorName;
	private Double prize;
	private String description;
	
	public Book() {
		
	}
	public Book(String id, String bookName, String authorName, Double prize, String description) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.prize = prize;
		this.description = description;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Double getPrize() {
		return prize;
	}
	public void setPrize(Double prize) {
		this.prize = prize;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
