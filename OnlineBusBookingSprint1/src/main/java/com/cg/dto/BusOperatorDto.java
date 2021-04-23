package com.cg.dto;

public class BusOperatorDto {
private String userId;
private String password;

public BusOperatorDto(String userId, String password) {
	super();
	this.userId = userId;
	this.password = password;
	
}
public BusOperatorDto() {
	super();
	// TODO Auto-generated constructor stub
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


}
