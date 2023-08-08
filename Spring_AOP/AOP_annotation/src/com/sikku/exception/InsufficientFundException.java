package com.sikku.exception;

public class InsufficientFundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundException(String err_msg) {
		super(err_msg);
	}
}
