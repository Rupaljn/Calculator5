package com.rakuten.dto;

import javax.management.RuntimeErrorException;

import com.rakuten.exceptions.DataInVaidException;

public class User {
private String fullName;
private String emailId;
private String password;
private long contactNumber;

public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	if(fullName.length()<3){
		throw new DataInVaidException("Name should be greater than 3 latter");
	}
	this.fullName = fullName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	if(emailId.length()<5){
		throw new DataInVaidException("Please enter the full emailId");
	}
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	if(password.length()<8){
		throw new DataInVaidException("Password should be 8 character");
	}
	this.password = password;
}

public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
}
