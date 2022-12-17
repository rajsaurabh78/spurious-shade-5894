package com.masai.modal;

public class Administrator {
	private int AdminId;
	private String name;
	private String email;
	private String pass;
	public Administrator(int adminId, String name, String email, String pass) {
		super();
		AdminId = adminId;
		this.name = name;
		this.email = email;
		this.pass = pass;
	}
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
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
		return "Administrator [AdminId=" + AdminId + ", name=" + name + ", email=" + email + ", pass=" + pass
				+ ", getAdminId()=" + getAdminId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getPass()=" + getPass() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
