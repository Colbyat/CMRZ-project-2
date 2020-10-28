package com.revature.dao;

import org.springframework.stereotype.Repository;

import com.revature.model.Appointment;
import com.revature.model.Person;
import com.revature.model.Prescription;

@Repository("PatientDAOImpl")
public class PatientDAOImpl implements PatientDAO {

	@Override
	public boolean createAppointment(int patientId, Appointment a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createRefillRequest(int patientId, int perscriptionId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person getPatientInfo(int patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prescription getPersciptionInfo(int prescriptionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointmentInfo(int appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePatientInfo(Person patient) {
		// TODO Auto-generated method stub
		return false;
	}

}
