package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Random;
import java.io.File;
import java.io.FileWriter;

public class DataStructuresUtil {
	// Take number of random number to generate as input and return array of random
	// number
	public static int[] getRandomArray(int number) {
		Random randomGenerator = new Random();
		int array[] = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = randomGenerator.nextInt();
		}
		return array;
	}

	// Function take String in dd/mm/yyyy format and return Date Object
	public static Date printDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return sdf.parse(date);
		} catch (ParseException pe) {
			return null;
		}
	}

	// format date object in this format 01/12/2016
	public static String getFormatedDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}

	
	
public static void printCalender(int d,int[] days,int month){
	   {
	 for (int i = 0; i < d; i++)
      System.out.print("   ");
  for (int i = 1; i <= days[month]; i++) 
  {
      System.out.printf("%2d ", i);
      if (((i + d) % 7 == 0) || (i == days[month])) 
      System.out.println();
  }
	   }
}
	   public static int Deposit(double amount, int curBalance) {
			curBalance += amount;
			return curBalance;
		}

		public static int Withdrawal(double amount, int curBalance) {
			curBalance -= amount;
			return curBalance;
		}

		public static void checkBalance(int curBalance) {
			System.out.println("Your current balance is: " + curBalance);
		}

		}

