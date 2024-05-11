package com.example.Book.Store.API.controller;

import com.example.Book.Store.API.constant.Constants;
import com.example.Book.Store.API.model.ContactUs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@Slf4j
public class HomeController {

	@GetMapping("/welcome")
	public String welcome() {
		log.info("HomeController::welcome - Method begins to provide welcome message.");
		return "Welcome to the book store api";
	}

	@GetMapping("/contact-details")
	public ContactUs contactDetails() {
		log.info("HomeController::welcome - Method begins to return contact us message.");
		return ContactUs
			.builder()
			.email(Constants.ContactUs.EMAIL)
			.phoneNumber(Constants.ContactUs.PHONE_NUMBER)
			.build();
	}
}