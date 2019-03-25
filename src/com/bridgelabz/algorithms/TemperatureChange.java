package com.bridgelabz.algorithms;

import com.bridgelabz.util.AlgorithmsUtil;

public class TemperatureChange {

	public static void main(String[] args) 
	{
		System.out.println("Enter the temperature");
		double temperature= AlgorithmsUtil.inputDouble();
		System.out.println("Press 1 for celsius and 2 for fahrenheit");
		int choice=AlgorithmsUtil.inputinteger();
		if(choice==1)
			System.out.println("Convert degrees to celsius");
		    
		if(choice==2)
			System.out.println("Convert degrees to fahrenheit");
		AlgorithmsUtil.tempConversion(temperature,choice);

	}

}
