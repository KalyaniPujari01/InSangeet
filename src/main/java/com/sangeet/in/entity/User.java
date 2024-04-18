package com.sangeet.in.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uid")
	int id;
	
	@Column(name="uname")
	String username;
	
	@Column(name="uemail")
	String email;
	
	@Column(name="upassword")
	String password;
	
	@Column(name="urole")
	String role;
	
	@Column(name="ugender")
	String gender;
	
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", role="
				+ role + ", gender=" + gender + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public User(String username, String email, String password, String role, String gender) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.gender = gender;
	}

	
	
	
	
}
