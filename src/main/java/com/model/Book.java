package com.model;

import java.time.LocalDate;

public class Book {
	
	private  long isbnid;
	private String title;
	private String author;
	private LocalDate publishdate;
	private String content;
	private double price;
	private String status;
	public long getIsbnid() {
		return isbnid;
	}
	public void setIsbnid(long isbnid) {
		this.isbnid = isbnid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(LocalDate publishdate) {
		this.publishdate = publishdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Book [isbnid=" + isbnid + ", title=" + title + ", author=" + author + ", publishdate=" + publishdate
				+ ", content=" + content + ", price=" + price + ", status=" + status + "]";
	}
	
	

}
