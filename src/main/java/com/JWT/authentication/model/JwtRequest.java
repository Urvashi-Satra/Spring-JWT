package com.JWT.authentication.model;

public class JwtRequest {

	private String email;
	
	private String Password;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public JwtRequest(String email, String password) {
		super();
		this.email = email;
		Password = password;
	}

	public JwtRequest() {
		super();
	}

	@Override
	public String toString() {
		return "JwtRequest [email=" + email + ", Password=" + Password + "]";
	}

	
}
