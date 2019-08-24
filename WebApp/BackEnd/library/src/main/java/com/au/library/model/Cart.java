package com.au.library.model;

public class Cart {
	private String id;
	private String bookName;
	private Double prize;
	
	
	public Cart() {
		
	}
	public Cart(String id, String bookName, Double prize) {
		super();
		this.id = id;
		this.bookName = bookName;	
		this.prize = prize;
	
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
	public Double getPrize() {
		return prize;
	}
	public void setPrize(Double prize) {
		this.prize = prize;
	}
	
	

}
