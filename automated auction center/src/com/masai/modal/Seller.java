package com.masai.modal;

public class Seller {
	private int sellerId;
	private String name;
	private String email;
	private String pass;
	public Seller(int sellerId, String name, String email, String pass) {
		super();
		this.sellerId = sellerId;
		this.name = name;
		this.email = email;
		this.pass = pass;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
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
	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", name=" + name + ", email=" + email + ", pass=" + pass
				+ ", getSellerId()=" + getSellerId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getPass()=" + getPass() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
