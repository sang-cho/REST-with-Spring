package com.cooksys.friendlr.exception;

public class PersonNotFoundException extends RuntimeException {
	
	public PersonNotFoundException(Integer personId) {
		super("Person not found for id[" + personId + "] !");	
	}

}
