package com.revature.dao;

import com.revature.model.Person;

public interface AuthDAO {

	public Person login(String username, String password);
	
}
