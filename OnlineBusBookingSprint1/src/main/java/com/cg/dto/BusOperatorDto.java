package com.cg.dto;

import javax.validation.constraints.NotEmpty;

public class BusOperatorDto {
	@NotEmpty(message = "username should not be empty")
	private String userId;
	@NotEmpty(message = "password should not be empty")
	private String password;

	public BusOperatorDto(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;

	}

	public BusOperatorDto() {
		super();

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