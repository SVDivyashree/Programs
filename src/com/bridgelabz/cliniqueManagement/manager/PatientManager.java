package com.bridgelabz.cliniqueManagement.manager;

import com.bridgelabz.cliniqueManagement.model.Patient;

public interface PatientManager {
	public void fileRead();
	public void addPatients(String name,int id,  Long mobilenumber, int age);

	public boolean searchPatients(String name);
	public Patient getPatient(String name);
	public String AvailablityPatient(String name);
	
	void addPatients(String name, int id, long mobilenumber, int age);
	
}
