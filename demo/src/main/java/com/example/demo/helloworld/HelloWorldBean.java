package com.example.demo.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String string) {
		this.message = string;
	}
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	
	
}
