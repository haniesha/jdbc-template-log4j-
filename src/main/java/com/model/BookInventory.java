package com.model;

public class BookInventory {
	
	private long isbnid;
	private int quantity;
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
	@Override
	public String toString() {
		return "BookInventory [isbnid=" + isbnid + ", quantity=" + quantity + "]";
	}
	
	
	
}
