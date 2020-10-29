package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * helper class used for com.revature.dao.AuthDAOImpl, to store
 * data from CriteriaQuery
 */
@Entity
@Table(name = "authtable")
public class LoginEntry {

	@OneToOne(targetEntity = Person.class)
	@JoinColumn(name = "personid")
	private Person person;
	
	@Id
	@Column
	private String username;
	
	@Column
	private String password;

	public LoginEntry() {
		super();
	}

	public LoginEntry(Person person, String username, String password) {
		super();
		this.person = person;
		this.username = username;
		this.password = password;
	}

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
}
