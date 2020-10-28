package com.revature.dao;

import com.revature.model.Appointment;
import com.revature.model.Person;
import com.revature.model.Prescription;

public interface PatientDAO {

	public boolean createAppointment(String patientId, Appointment a);
	public boolean createRefillRequest(String patientId, String perscriptionId);
	public Person getPatientInfo(String patientId);
	public Prescription getPersciptionInfo(String prescriptionId);
	public Appointment getAppointmentInfo(String appointmentId);
	public boolean updatePatientInfo(Person patient);
	
}
