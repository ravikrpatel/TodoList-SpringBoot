package com.todolist.services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationClass {
  
	
	public Boolean Authenticate(String username, String password) {
		
		boolean isvalidusername= username.equalsIgnoreCase("ravikrpatel");
		boolean isvalidpassword=password.equalsIgnoreCase("ravikr");
		return isvalidusername && isvalidpassword;
		
	}
}
