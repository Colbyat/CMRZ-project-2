package com.revature.model;

import java.sql.Date;

public class Appointment 
{
    private int id;
    private Person patient;
    private Person doctor;
    
    private Date date;
    private String comment;
    private String status;
    
    public Appointment(int id, Person patient, Person doctor, Date date, String comment, String status)
    {
	this.id = id;
	this.patient = patient;
	this.doctor = doctor;
	this.date = date;
	this.comment = comment;
	this.status = status;
    }	
}
