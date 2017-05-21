package com.webtools.cms.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id @GeneratedValue
	@Column(name="userid", unique = true, nullable = false)
	private int userID;
	
	@Column(name="username",unique=true)
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name = "role")
	private String role;
	
	public User(){
	}
	
	public int getId() {
		return userID;
	}
	public void setId(int id) {
		this.userID = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
