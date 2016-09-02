package com.dnb.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "users_details")
public class UserDetailsModel implements Serializable {

	private String loginId;
	private String loginPassword;
	private String userRole;
	private Date userCreated;
	
	@Id
	@Column(name = "login_id")
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	@Column(name = "login_password")
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	@Column(name = "user_role")
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	@Column(name = "user_created")
	public Date getUserCreated() {
		return userCreated;
	}
	public void setUserCreated(Date userCreated) {
		this.userCreated = userCreated;
	}
	
}
