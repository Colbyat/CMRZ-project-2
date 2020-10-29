package com.revature.service;

import com.revature.dao.AuthDAO;
import com.revature.dao.AuthDAOImpl;
import com.revature.model.Person;

public class LoginService {

	/*
	 * see com.revature.dao.AuthDAOImpl
	 */
	public int login(String username, String password) {
		AuthDAO auth = new AuthDAOImpl();
		return auth.login(username, password);
	}
	
}
