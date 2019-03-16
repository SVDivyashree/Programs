package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;

public class TemperatureChange {

	public static void main(String[] args) 
	{
		System.out.println("Enter the temperature");
		double temperature= Algorithms_util.inputDouble();
		System.out.println("Press 1 for celsius and 2 for fahrenheit");
		int choice=Algorithms_util.inputinteger();
		if(choice==1)
			System.out.println("Convert degrees to celsius");
		    
		if(choice==2)
			System.out.println("Convert degrees to fahrenheit");
		Algorithms_util.tempConversion(temperature,choice);

	}

}
