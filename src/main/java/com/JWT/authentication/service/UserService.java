package com.JWT.authentication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.JWT.authentication.model.User;

@Service
public class UserService {

	/**
	 * List<User>: This declares the type of the variable store. 
	 * It's a generic List that can hold objects of type User. 
	 * The User type is a placeholder for the type of objects 
	 * that will be stored in the list.
	 */
	private List<User> store = new ArrayList<>();
	
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"urvashi satra","satraurvashi99@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"pooja satra","pooja@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"ankit satra","ankit@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"sheetal satra","sheetal@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
}
