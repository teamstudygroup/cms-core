package com.studygroup.cms.views;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserLoginViewBean {
	
	@Size(min=3, max=10) @NotNull
	private String username; 
	
	@Size(min=3, max=10) @NotNull
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
