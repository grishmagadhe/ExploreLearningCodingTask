package com.explore.users.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Not Found")
public class UserNotFoundexception extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}
	public UserNotFoundexception(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public UserNotFoundexception() {
		super();
	}
}


