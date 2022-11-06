package com.code.signleton;

public class AdminUser {
	
	private String username;
	private String passowrd;

	//create an instance to send to outside
	private static AdminUser adminUser=new AdminUser();
	
	//create a private constructor restricting the object creation from outside
	private AdminUser() {
		this.passowrd="Admin123";
		this.username="Admin";
	}
	
	//method to get the instance from outside
	public static AdminUser getInstance() {
		return adminUser;
	}
	public String getusername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.passowrd;
	}
	
	public void dispalyDetails() {
		System.out.print("Displaying Admin details");
	}
}
