package com.example.Book.Store.API.constant;

public final class Constants {
	public static final class ContactUs {
		public static final String EMAIL = "sample-email@gamil.com";
		public static final int PHONE_NUMBER = 1234567890;
		public static final int COUNTRY_CODE = 91;
	}

	public static final String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String SMALL_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String NUMERIC = "1234567890";
	public static final class Auth {
		public static final int TOKEN_LENGTH = 64;
		public static final String AUTH_TOKEN = "auth-token";
		public static final String TOKEN_CHARACTERS = Constants.CAPITAL_LETTERS + Constants.SMALL_LETTERS + Constants.NUMERIC;
	}
}