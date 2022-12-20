package com.masai.modal;

public class Seller {
	private int sid;
	private String name;
	private String email;
	private String pass;
	
public Seller() {
	// TODO Auto-generated constructor stub
}

public Seller(int sid, String name, String email, String pass) {
	super();
	this.sid = sid;
	this.name = name;
	this.email = email;
	this.pass = pass;
}

@Override
public String toString() {
	return "Seller [sid=" + sid + ", name=" + name + ", email=" + email + ", pass=" + pass + "]";
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
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
