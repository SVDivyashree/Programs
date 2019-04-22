package com.bridgelabz.cliniqueManagement.manager;

import com.bridgelabz.cliniqueManagement.model.Doctor;

public interface AppointmentManager {
	public void takeAppointment();

	public Doctor searchDoctorByName(String doctorName);

	public Doctor searchDoctorBySpec(String spec);

}
