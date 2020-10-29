package com.revature.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {

	private static SessionFactory sessionFactory;

	public static Session getSession() {
		if (sessionFactory == null) {

			// property obj to hold our connection info
			Properties auth = new Properties();

			// read properties from file
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
						auth.put("url", parts[1]);
					else if (parts[0].equals("uname")) {
						auth.put("user", parts[1]);
					} else if (parts[0].equals("pass")) {
						auth.put("password", parts[1]);
					}
				}
			} catch (IOException e) {
				System.out.println(
						"Error in your connection.prop file! Check if key and value are delimeted by .=. ! Also check if the key names are correct and their corresponding values are correct too!");
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
			/*
			System.out.println(auth.getProperty("url"));
			System.out.println(auth.getProperty("user"));
			System.out.println(auth.getProperty("password"));
			*/

			sessionFactory = new Configuration().configure()
					.setProperty("hibernate.connection.url", "jdbc:postgresql://epatient.cku8xrcflipx.us-west-2.rds.amazonaws.com/"/*auth.getProperty("url")*/)
					.setProperty("hibernate.connection.username", "postgres"/*auth.getProperty("user")*/)
					.setProperty("hibernate.connection.password", "*CMRZ3334"/*auth.getProperty("password")*/)
					.buildSessionFactory();
		}
		return sessionFactory.getCurrentSession();
	}
}
