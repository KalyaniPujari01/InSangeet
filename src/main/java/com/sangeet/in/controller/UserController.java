package com.sangeet.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sangeet.in.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userser;
	
	
	public UserController(UserService userser) {
		this.userser=userser;
	}
	
	
	
}
