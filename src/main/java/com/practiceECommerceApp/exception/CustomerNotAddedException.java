package com.practiceECommerceApp.exception;

public class CustomerNotAddedException extends Exception {

	public CustomerNotAddedException() {
	}

	public CustomerNotAddedException(String message) {
		super(message);
	}

	public CustomerNotAddedException(Throwable cause) {
		super(cause);
	}

	public CustomerNotAddedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerNotAddedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
