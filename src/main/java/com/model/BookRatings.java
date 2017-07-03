package com.model;

public class BookRatings {
	
	private long isbnid;
	private int userid;
	private double ratings;
	public long getIsbnid() {
		return isbnid;
	}
	public void setIsbnid(long isbnid) {
		this.isbnid = isbnid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "BookRatings [isbnid=" + isbnid + ", userid=" + userid + ", ratings=" + ratings + "]";
	}
	
	

}
