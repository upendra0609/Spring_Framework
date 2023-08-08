package com.sikku.exception;




public class StudentMarksOutOfBoundException extends RuntimeException {
	private String Exception_Message;

	private static final long serialVersionUID = 1L;

	
	public StudentMarksOutOfBoundException(String Exception_Message) {
		this.setException_Message(Exception_Message);
	}

	public String getException_Message() {
		return Exception_Message;
	}

	public void setException_Message(String exception_Message) {
		Exception_Message = exception_Message;
	}

}
