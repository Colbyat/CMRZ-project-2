package com.revature.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.dao.PatientDAO;
import com.revature.model.Appointment;
import com.revature.model.Person;
import com.revature.model.Prescription;

class PatientServiceTest {
	
	@InjectMocks
	public static PatientService ps;
	
	@Mock
	public PatientDAO pdao;
	
	public static Person testPatient = new Person(
		1,
		"Test Patient",
		"555-555-5555",
		"patient@email.com"
	);
	
	public static Person testDoctor = new Person(
		2,
		"Test Doctor",
		"777-777-7777",
		"doctor@email.com"
	);
	
	public static Appointment testAppt = new Appointment(
		1,
		testPatient,
		testDoctor,
		null,
		"Test comment.",
		"Approved"
	);
	
	// TODO fill once Prescription object class is filled.
	public static Prescription testPrescription = new Prescription();
	
	@BeforeEach
	void initPatientDAO() {
		MockitoAnnotations.openMocks(this);
	}

	@Test 
	void testCreateAppointmentSuccess() {
		int testPatientId = testPatient.getId();
		Mockito.when(pdao.createAppointment(testPatientId, testAppt)).thenReturn(true);
		
		ps = new PatientService(pdao);
		boolean success = ps.createAppointment(testPatientId, testAppt);
		Assertions.assertEquals(true, success);
	}
	
	@Test
	void testCreateAppointmentFail() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCreateRefillRequestSuccess() {
		int testPatientId = testPatient.getId();
		int prescriptionId = 999;
		Mockito.when(pdao.createRefillRequest(testPatientId, prescriptionId)).thenReturn(true);
		
		ps = new PatientService(pdao);
		boolean success = ps.createRefillRequest(testPatientId, prescriptionId);
		Assertions.assertEquals(true, success);
	}
	
	@Test
	void testCreateRefillRequestFail() {
		fail("Not yet implemented");
	}
	
	@Test
	void testGetPatientInfo() {
		int patientId = testPatient.getId();
		Mockito.when(pdao.getPatientInfo(patientId)).thenReturn(testPatient);
		
		ps = new PatientService(pdao);
		Person retrievedPatient = ps.getPatientInfo(patientId);
		Assertions.assertEquals(testPatient, retrievedPatient);
	}
	
	@Test
	void testGetPrescriptionInfo() {
		fail("Not yet implemented");
	}
	
	@Test
	void testGetAppointmentInfo() {
		// TODO: When getters/setters are defined in Appt, replace this with getId().
		int apptId = 1;
		Mockito.when(pdao.getAppointmentInfo(apptId)).thenReturn(testAppt);
		
		ps = new PatientService(pdao);
		Appointment retrievedAppointment = ps.getAppointmentInfo(apptId);
		Assertions.assertEquals(testAppt, retrievedAppointment);
	}
	
	@Test
	void testUpdatePatientInfoSuccess() {
		Mockito.when(pdao.updatePatientInfo(testPatient)).thenReturn(true);
		
		ps = new PatientService(pdao);
		boolean success = ps.updatePatientInfo(testPatient);
		Assertions.assertEquals(true, success);
	}
	
	@Test
	void testUpdatePatientInfoFail() {
		fail("Not yet implemented");
	}
}
