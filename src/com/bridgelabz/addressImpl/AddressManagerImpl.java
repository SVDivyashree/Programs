package com.bridgelabz.addressImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.addressinterface.AddressManager;
import com.bridgelabz.addressmodel.AddressBook;
import com.bridgelabz.inventorymodel.Inventory;
import com.bridgelabz.util.FunctionalUtil;
import com.google.gson.Gson;

public class AddressManagerImpl implements AddressManager {
	List<AddressBook> addressDetails = new ArrayList<>();

	public void readfile() throws FileNotFoundException {

		JSONParser parser = new JSONParser();
		{
			try {
				Object obj = parser.parse(new FileReader("C:\\Users\\Divya\\Desktop\\d\\addressBook.json"));
				JSONObject jsonObject = (JSONObject) obj;
				System.out.println(jsonObject);
				JSONArray jsonArray = (JSONArray) jsonObject.get("AddressBook");

				for (Object obj1 : jsonArray) {
					AddressBook details = new AddressBook();

					String firstname = (String) ((JSONObject) obj1).get("firstname");
					String lastname = (String) ((JSONObject) obj1).get("lastname");
					String street = (String) ((JSONObject) obj1).get("street");
					String city = (String) ((JSONObject) obj1).get("city");
					String state = (String) ((JSONObject) obj1).get("state");
					Long zipcode = (Long) ((JSONObject) obj1).get("zipcode");
					Long phonenumber = (Long) ((JSONObject) obj1).get("phonenumber");

					details.setFirstname(firstname);
					details.setLastname(lastname);
					details.setStreet(street);
					details.setCity(city);
					details.setState(state);
					details.setZipcode(zipcode);
					details.setPhonenumber(phonenumber);
					addressDetails.add(details);
					
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace(); 
			} catch (IOException e) {

				e.printStackTrace();
			} catch (ParseException e) {

				e.printStackTrace();
			}
		}
	}

	public void addPerson(String firstname, String lastname, String street, String city, String state, Long zipcode,Long phonenumber)
	{
		AddressBook details = new AddressBook();

		details.setFirstname(firstname);
		
		details.setLastname(lastname);
		details.setStreet(street);
		details.setCity(city);
		details.setState(state);
		details.setZipcode(zipcode);
		details.setPhonenumber(phonenumber);
		details.getPhonenumber();
	

		addressDetails.add(details);
		addressDetails.forEach(persondetails -> System.out.println(persondetails));

	}

	@Override
	public void deletePerson() {
		{
			System.out.println("Enter whose detail needs to be removed");
			String removekey = FunctionalUtil.inputString();
			addressDetails.removeIf(address -> address.getFirstname().equals(removekey));
			writeFile();
			System.out.println("Element successfully removed");
		}
	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(addressDetails);
		try {
			FileWriter file = new FileWriter("C:\\Users\\Divya\\Desktop\\d\\addressbook.json");
			file.write("{\"AddressBook\":" + json + "}");
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void sortByLastName()
	{
		 addressDetails.sort((AddressBook s1, AddressBook s2)->s1.getLastname().compareTo(s2.getLastname())); 
	      addressDetails.forEach((s)->System.out.println(s));   
	}

	@Override
	public void sortByZipCode() {

		 addressDetails.sort((AddressBook b1, AddressBook b2)->b1.getZipcode().compareTo(b2.getZipcode())); 
	     addressDetails.forEach((s)->System.out.println(s));   
		
	}

	
	}

	



	