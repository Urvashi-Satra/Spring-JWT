package com.JWT.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

	
	/**
	 * step1: post : http://localhost:8081/auth/login
	 * Body -> raw -> json 
	 * 
	 * 	{

    	"email":"urvashi",
    	"password":"urvashi"
		}
		
		copy token 
		and do 
		
		get: http://localhost:8081/home/users
		Headers -> add
		Authorization 
		value as  Bearer {token}
	 */
}
