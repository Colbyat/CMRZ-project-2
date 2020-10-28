package com.revature.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginServiceTest {

	@Test
	public void testLogin() {
		LoginService l = new LoginService();
		
		assertEquals(l.login("user", "password"), 1);
		assertEquals(l.login("user", "password1"), -1);
		assertEquals(l.login("gjhsfgjh", "password"), -1);
	}
	
}
