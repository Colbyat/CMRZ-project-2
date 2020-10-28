package com.revature.dao;

import java.util.List;

import com.revature.model.Appointment;
import com.revature.model.Person;

public interface NurseDAO {

	public Person getPatientInfo(String patientId);
	public Appointment getAppointmentInfo(String appointmentId);
	public List<Appointment> getAppointmentsWithDoctor(String doctorId);
	public List<Appointment> getAppointmentsWithPatient(String patientId);
	public boolean approveAppointment(String appointmentId);
	public boolean rejectAppointment(String appointmentId);
	public boolean cancelAppointment(String appointmentId);
	public boolean updateNurseInfo(String nurseId);
	
}
