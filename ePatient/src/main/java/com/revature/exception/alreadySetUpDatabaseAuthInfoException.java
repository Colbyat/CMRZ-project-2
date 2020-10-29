package com.revature.exception;

public class alreadySetUpDatabaseAuthInfoException extends Exception {

	private static final long serialVersionUID = 1L;

	public alreadySetUpDatabaseAuthInfoException() {
		super("You can only call the setProperties method in GetAuth class once!");
	}
}
