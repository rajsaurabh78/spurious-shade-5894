package com.masai.modal;

public class Administrator {
	private int aid;
	private String name;
	private String email;
	private String pass;
	public Administrator() {
		// TODO Auto-generated constructor stub
	}
	public Administrator(int aid, String name, String email, String pass) {
		super();
		this.aid = aid;
		this.name = name;
		this.email = email;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Administrator [aid=" + aid + ", name=" + name + ", email=" + email + ", pass=" + pass + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
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
