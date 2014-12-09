package com.pratik.exceptions;

@SuppressWarnings("serial")
public class UserNotFounException extends RuntimeException {

	public UserNotFounException(String message){
		super(message);
	}
}
