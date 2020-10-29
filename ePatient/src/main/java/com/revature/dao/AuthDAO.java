package com.revature.dao;

import com.revature.model.Person;

public interface AuthDAO {

	public int login(String username, String password);
	
}
