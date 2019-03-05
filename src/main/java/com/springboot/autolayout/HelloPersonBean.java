package com.springboot.autolayout;

public class HelloPersonBean {

	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String say() {
		return "hello"+msg;
	}
}
