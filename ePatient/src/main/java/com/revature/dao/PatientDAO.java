package com.revature.dao;

import com.revature.model.Appointment;
import com.revature.model.Person;
import com.revature.model.Prescription;

public interface PatientDAO {

	public boolean createAppointment(int patientId, Appointment a);
	public boolean createRefillRequest(int patientId, int perscriptionId);
	public Person getPatientInfo(int patientId);
	public Prescription getPersciptionInfo(int prescriptionId);
	public Appointment getAppointmentInfo(int appointmentId);
	public boolean updatePatientInfo(Person patient);
	
}
