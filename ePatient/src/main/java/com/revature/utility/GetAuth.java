package com.revature.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.revature.exception.alreadySetUpDatabaseAuthInfoException;

public class GetAuth {
	/**
	 * stores key-value pair of the required info
	 */
	public static Properties property;
	
	/**
	 * this flag will stay false until you call the setProperties() method, 
	 * then it will stay true. Once it is set to true, you can not change it.
	 * Also if you call the seProperties() method, it will throw an exception!
	 */
	private static boolean used_flag = false;
	
	/**
	 * Prints the information stored in property<br>For debug purpose only!
	 */
	public static void printProperty() {
		System.out.println("URL: " + GetAuth.property.getProperty("url"));
		System.out.println("uname: " + GetAuth.property.getProperty("uname"));
		System.out.println("pass: " + GetAuth.property.getProperty("pass"));
	}
	
	/**
	 * Stores necessary information in property for use in DAOUtilities.java
	 * @throws alreadySetUpDatabaseAuthInfoException throws this exception if the method is called more than once
	 */
	public static void setProperties() throws alreadySetUpDatabaseAuthInfoException {
		// if already called this method after startup, throw an exception
		if(used_flag)
			throw new alreadySetUpDatabaseAuthInfoException();
		
		// set to true so that if next time this method is called, throws an exception
		used_flag = true;
		
		Properties auth = new Properties();		
		FileReader fr = null;
		String filePath = "~/.auth/connection.prop";
		
		try {
			fr = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("File " + filePath + " not found!");
			System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
		}
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		
		try {
			while ((str = br.readLine()) != null) {
				String[] parts = str.split(".=.");
				if (parts[0].equals("url"))
					auth.put("url",parts[1]);
				else if (parts[0].equals("uname")) {
					auth.put("user",parts[1]);
				}
				else if (parts[0].equals("pass")) {
					auth.put("password",parts[1]);
				}
			}
		} catch (IOException e) {
			System.out.println("Error in your connection.prop file! Check if key and value are delimeted by .=. ! Also check if the key names are correct and their corresponding values are correct too!");
			e.printStackTrace();
			System.out.println("=======================================================================");
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		property = auth;

	}
	
	public static void setDefault() {
		property = null;
		used_flag = false;
	}    
}
