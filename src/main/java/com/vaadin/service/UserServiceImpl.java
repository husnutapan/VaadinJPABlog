package com.vaadin.service;

import com.vaadin.model.User;

public class UserServiceImpl {
	
	public void registerUser(User user){
		System.out.println(user.getEmail());
	}

}
