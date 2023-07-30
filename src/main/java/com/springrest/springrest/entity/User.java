package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private int id;
	private int contact_no;
	private String name,email_id,password,address;
	public User(int id, int contact_no, String name, String email_id, String password, String address) {
		super();
		this.id = id;
		this.contact_no = contact_no;
		this.name = name;
		this.email_id = email_id;
		this.password = password;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", contact_no=" + contact_no + ", name=" + name + ", email_id=" + email_id
				+ ", password=" + password + ", address=" + address + "]";
	}
	
}
