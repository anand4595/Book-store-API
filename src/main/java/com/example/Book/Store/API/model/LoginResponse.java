package com.example.Book.Store.API.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

/**
 * @author anand
 * Model class to map login responce.
 */
@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class LoginResponse {
	public User user;
	public String token;
}
