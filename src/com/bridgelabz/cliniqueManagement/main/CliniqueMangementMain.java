package com.bridgelabz.cliniqueManagement.main;

import com.bridgelabz.cliniqueManagement.Implementation.AppointmentImplementation;
import com.bridgelabz.cliniqueManagement.Implementation.DoctorImplementation;
import com.bridgelabz.cliniqueManagement.Implementation.PatientImplementation;
import com.bridgelabz.cliniqueManagement.manager.AppointmentManager;
import com.bridgelabz.cliniqueManagement.manager.DoctorManager;
import com.bridgelabz.cliniqueManagement.manager.PatientManager;
import com.bridgelabz.util.FunctionalUtil;

public class CliniqueMangementMain {

	public static void main(String[] args) {
		PatientManager patient = new PatientImplementation();
		DoctorManager doctor = new DoctorImplementation();
		AppointmentManager appointment = new AppointmentImplementation();
		int n = 0;
		do {
			System.out.println("Enter the choice");
			System.out.println("1:Add the doctor"
					+ "  2:Search the doctor  "
					+ "3: Add the patient"
					+ "4:Search the patient   5:Take Appointment ");
			int choice = FunctionalUtil.inputinteger();
			switch (choice) {
			case 1:
				System.out.println("Enter the name of a doctor");
				String name = FunctionalUtil.inputString();
				System.out.println("Enter the identity number of a doctor");
				int id = FunctionalUtil.inputinteger();
				System.out.println("Check the availability of a doctor");
				String availability = doctor.AvailablityDoctor(name);
				System.out.println("Enter the specialization of a doctor");
				String specialization = FunctionalUtil.inputString();
				doctor.addDoctor(name, id, availability, specialization);
				break;
			case 2:
				System.out.println("Enter the name of a doctor");
				String doctorname = FunctionalUtil.inputString();
				doctor.searchDoctor(doctorname);
				break;
			case 3:
				System.out.println("Enter the name of a patient");
				String patientname = FunctionalUtil.inputString();
				System.out.println("Enter the identity number of a patient");
				int ID = FunctionalUtil.inputinteger();
				System.out.println("Enter the mobile number of a patient");
				Long mobilenumber= (long) FunctionalUtil.inputinteger();
				int age = FunctionalUtil.inputinteger();
				System.out.println("Enter the age of a patient");
				patient.addPatients(patientname, ID, mobilenumber, age);
				break;
           case 4:
				System.out.println("Enter the name of a patient");
				String ptname = FunctionalUtil.inputString();
				patient.searchPatients(ptname);
				break;

			case 5:
				appointment.takeAppointment();

				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (n < 1);
	}
}