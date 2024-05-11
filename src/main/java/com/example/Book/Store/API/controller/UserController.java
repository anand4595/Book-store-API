package com.example.Book.Store.API.controller;

import com.example.Book.Store.API.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping()
	public String getUser(String user) {
		return user;
	}
}
