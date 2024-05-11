package com.example.Book.Store.API.controller;

import com.example.Book.Store.API.constant.Constants;
import com.example.Book.Store.API.model.LoginRequest;
import com.example.Book.Store.API.model.LoginResponse;
import com.example.Book.Store.API.model.PhoneNumber;
import com.example.Book.Store.API.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/auth/user")
@Slf4j
public class UserAuthController {
	public static String email = "sample@gamil.com";
	public static String phoneNumber = "1234567890";

	/**
	 * Method to get random auth token.
	 * @param tokenLength - Length of token to be generated. Minimum length of 32 is recommended.
	 * @return Auth token
	 */
	protected String getAuthToken(int tokenLength) {
		StringBuilder token = new StringBuilder();
		Random rnd = new Random();
		while (token.length() < tokenLength) { // length of the random string.
			int index = (int) (rnd.nextFloat() * Constants.Auth.TOKEN_CHARACTERS.length());
			token.append(token.charAt(index));
		}
		return token.toString();
	}

	@PostMapping("/login")
	LoginResponse login(@RequestBody LoginRequest loginRequest) {
		log.info("UserAuthController::login - ");
		return LoginResponse
			.builder()
			.user(
				User
					.builder()
					.email(email)
					.phoneNumber(new PhoneNumber(Constants.ContactUs.COUNTRY_CODE, Constants.ContactUs.PHONE_NUMBER))
					.build()
			)
			.token(getAuthToken(Constants.Auth.TOKEN_LENGTH))
			.build();
	}

	@PostMapping("/logout")
	void logout() {

	}

	@PostMapping("/sign-up")
	void signUp() {

	}
}