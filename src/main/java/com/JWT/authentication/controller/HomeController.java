package com.JWT.authentication.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JWT.authentication.model.User;
import com.JWT.authentication.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getUser() {
		return userService.getUsers();
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}
}
