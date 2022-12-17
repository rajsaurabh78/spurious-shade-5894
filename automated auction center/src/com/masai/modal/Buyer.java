package com.masai.modal;

public class Buyer {
	private int buyerId;
	private String name;
	private String email;
	private String pass;
	public Buyer(int buyerId, String name, String email, String pass) {
		super();
		this.buyerId = buyerId;
		this.name = name;
		this.email = email;
		this.pass = pass;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
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
		return "Buyer [buyerId=" + buyerId + ", name=" + name + ", email=" + email + ", pass=" + pass
				+ ", getBuyerId()=" + getBuyerId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getPass()=" + getPass() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
