package com.capgemini.retailer_management_system.springboot.exception;

public class Exception extends RuntimeException {
	
	String msg;
	
	public Exception(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
	

}
