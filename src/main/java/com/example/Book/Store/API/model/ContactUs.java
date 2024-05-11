package com.example.Book.Store.API.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ContactUs {
	public String email;
	public String phoneNumber;
}
