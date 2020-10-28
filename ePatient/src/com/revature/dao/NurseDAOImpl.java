package com.revature.dao;

import java.util.List;

import com.revature.model.Appointment;
import com.revature.model.Person;

public class NurseDAOImpl implements NurseDAO {

	@Override
	public Person getPatientInfo(String patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointmentInfo(String appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAppointmentsWithDoctor(String doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAppointmentsWithPatient(String patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveAppointment(String appointmentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejectAppointment(String appointmentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelAppointment(String appointmentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateNurseInfo(String nurseId) {
		// TODO Auto-generated method stub
		return false;
	}

}
