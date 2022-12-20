package com.masai.modal;

public class Buyer {
	private int bid;
	private String name;
	private String email;
	private String pass;
	private String location;
	public Buyer() {
		// TODO Auto-generated constructor stub
	}
	public Buyer(int bid, String name, String email, String pass,String location) {
		super();
		this.bid = bid;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.location=location;
	}
	
	
	@Override
	public String toString() {
		return "Buyer [bid=" + bid + ", name=" + name + ", email=" + email + ", pass=" + pass + ", location=" + location
				+ "]";
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
