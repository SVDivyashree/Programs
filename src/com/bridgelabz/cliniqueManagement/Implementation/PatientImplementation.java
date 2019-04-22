package com.bridgelabz.cliniqueManagement.Implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.cliniqueManagement.manager.PatientManager;
import com.bridgelabz.cliniqueManagement.model.Doctor;
import com.bridgelabz.cliniqueManagement.model.Patient;

public class PatientImplementation implements PatientManager {
	JSONArray jsonarray1;
	List<Patient> patients = new ArrayList<>();
	JSONObject jobj1 = new JSONObject();

	@Override
	public void fileRead() {
		JSONParser jp = new JSONParser();
		{
			try {
				File file1 = new File("‪C:\\Users\\Divya\\Desktop\\d\\patient.json");
				System.out.println("file exists : " + file1.exists() + " \n" + "File path" + file1.getAbsolutePath());

				FileReader fr = new FileReader(file1);

				jobj1 = (JSONObject) jp.parse(fr);

				jsonarray1 = (JSONArray) jobj1.get("Patients");

				for (Object obj : jsonarray1) {

					Patient p = new Patient();

					jobj1 = (JSONObject) obj;

					String name = (String) jobj1.get("name");
					int id = ((Long) jobj1.get("id")).intValue();
					int mn = ((Long) jobj1.get("mobileNumber")).intValue();
					int age = (((Long) jobj1.get("age")).intValue());

					p.setId(id);
					p.setName(name);
					p.setMobilenumber((long) mn);
					p.setAge(age);

					patients.add(p);

					System.out.println(p.toString());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

	@Override
	public void addPatients(String name, int id, long mobilenumber, int age) {
		Patient pt = new Patient();
		pt.setName(name);
		pt.setId(id);
		pt.setMobilenumber(mobilenumber);
		pt.setAge(age);
		patients.forEach(patient1 -> System.out.println(patient1.toString()));
	}

	@Override
	public String AvailablityPatient(String name) {
		String time = "";

		for (Patient availability : patients) {
			if (searchPatients(name) == true) {
				time = availability.getAvailability();
			}
		}
		return time;
	}

	@Override
	public Patient getPatient(String name) {
		for (Patient patient : patients) {
			if (name.equals(patient.getName())) {
				return patient;
			}
		}
		return null;
	}

	public boolean searchPatients(String name) {
		for (Patient patient : patients) {
			if (name.equals(patient.getName())) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void addPatients(String name, int id, Long mobilenumber, int age) {
		// TODO Auto-generated method stub
		
	}
}
