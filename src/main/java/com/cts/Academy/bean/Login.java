package com.cts.Academy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Login {
	@Id
	@Column
	String userId;
	@Column
	String password;
	@Column
	String userType;
	@Column
	String userStatus;
	
	public Login() {
		super();// TODO Auto-generated constructor stub
	}
	
	public Login(String userId, String password, String userType, String userStatus) {
		super();
		this.userId = userId;
		this.password = password;
		this.userType = userType;
		this.userStatus = userStatus;
	}





	@Override
	public String toString() {
		return "Login [userId=" + userId + ", password=" + password + ", userType=" + userType + ", userStatus="
				+ userStatus + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
}
