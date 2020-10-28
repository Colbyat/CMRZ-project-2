package com.revature.dao;

public interface DoctorDAO {

	public boolean prescribe(String patientId, String medicationId);
	public boolean approveRefillRequest(String requestId);
	public boolean rejectRefillRequest(String requestId);
	public boolean orderMedication(String medicationId, int amount);
	
}
