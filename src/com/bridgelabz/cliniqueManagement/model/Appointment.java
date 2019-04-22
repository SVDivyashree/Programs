package com.bridgelabz.cliniqueManagement.model;

import java.time.LocalDate;

public class Appointment { 
	private LocalDate date;
	private String doctor;
	private String patient;
	private String key;
	public Appointment(String date, String doctor, String patient) {

	}
	public String getKey() {
		return date + ":" + doctor;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
    
}
