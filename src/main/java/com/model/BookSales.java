package com.model;

import java.time.LocalDate;

public class BookSales {
	
	private int salesid;
	private int userid;
	private long isbnid;
	private int quantity;
	private double price;
	private double totalAmount;
	private LocalDate orderDate;
	private String status;
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public long getIsbnid() {
		return isbnid;
	}
	public void setIsbnid(long isbnid) {
		this.isbnid = isbnid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BookSales [salesid=" + salesid + ", userid=" + userid + ", isbnid=" + isbnid + ", quantity=" + quantity
				+ ", price=" + price + ", totalAmount=" + totalAmount + ", orderDate=" + orderDate + ", status="
				+ status + "]";
	}
	
	
	

}
