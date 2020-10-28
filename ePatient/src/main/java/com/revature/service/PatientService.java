package com.revature.service;

import com.revature.dao.PatientDAO;
import com.revature.model.Appointment;
import com.revature.model.Person;
import com.revature.model.Prescription;

public class PatientService {
	public boolean createAppointment(int patientId, Appointment appt, PatientDAO pdao) {
		return false;
	}
	
	public boolean createRefillRequest(int patientId, int prescriptionId) {
		return false;
	}
	
	public Person getPatientInfo(int patientId) {
		return null;
	}
	
	public Prescription getPrescriptionInfo(int prescriptionId) {
		return null;
	}
	
	public Appointment getAppointmentInfo(int appointmentId) {
		return null;
	}
	
	public boolean updatePatientInfo(Person newPatient) {
		return false;
	}
}
