package com.practiceECommerceApp.exception;

public class CustomerNotDeletedException extends Exception {

	public CustomerNotDeletedException() {
	}

	public CustomerNotDeletedException(String message) {
		super(message);
	}

	public CustomerNotDeletedException(Throwable cause) {
		super(cause);
	}

	public CustomerNotDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerNotDeletedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
