package com.giridhar.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Long empId;
	@Column(name="user_name")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="mobile_number")
	private Long mobileNumber;
	@Column(name="roll")
	private String Roll;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
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
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getRoll() {
		return Roll;
	}
	public void setRoll(String roll) {
		Roll = roll;
	}
	public User(Long empId, String userName, String password, Long mobileNumber, String roll) {
		super();
		this.empId = empId;
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		Roll = roll;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
}
