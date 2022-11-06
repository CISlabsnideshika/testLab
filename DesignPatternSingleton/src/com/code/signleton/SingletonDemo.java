package com.code.signleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//get the only instance from the AdminUser class through getInstance method
		AdminUser admin=AdminUser.getInstance();
		
		admin.dispalyDetails();
	}

}
