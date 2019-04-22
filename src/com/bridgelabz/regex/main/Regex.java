package com.bridgelabz.regex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.regex.impl.RegexImpl;
import com.bridgelabz.util.FunctionalUtil;

public class Regex 
{
	public static void main(String[] args) {
		BufferedReader read = new BufferedReader(FileOperation.readFile("‪C:\\Users\\Divya\\Desktop\\d\\Regex.txt"));
		String message = "";
		String word = "";

		try {
			while ((word = read.readLine()) != null) {
				message = word;
			}
			System.out.println("Please enter the first name");
			String firstName = FunctionalUtil.inputString();
			System.out.println("Please enter the last name");
			String lastName = FunctionalUtil.inputString();
			String fullName = firstName + " " + lastName;
			System.out.println("Please enter your 10 digit phone number");
			String phoneNum = FunctionalUtil.inputString();

			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			String formattedDate = dateFormat.format(date);
			String messageReturn = RegexImpl.replace(firstName, fullName, phoneNum, formattedDate, message);

			System.out.println(messageReturn);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}



