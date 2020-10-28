package com.revature.dao;

import com.revature.model.Appointment;
import com.revature.model.Person;
import com.revature.model.Prescription;

public class PatientDAOImpl implements PatientDAO {

	@Override
	public boolean createAppointment(String patientId, Appointment a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createRefillRequest(String patientId, String perscriptionId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person getPatientInfo(String patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prescription getPersciptionInfo(String prescriptionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointmentInfo(String appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePatientInfo(Person patient) {
		// TODO Auto-generated method stub
		return false;
	}

}
