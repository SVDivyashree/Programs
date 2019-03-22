package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;

public class MonthlyPayment {

	public static void main(String[] args)
	{
		Double principal= Double.parseDouble(args[0]);
        Double years=Double.parseDouble(args[1]);
        Double rate= Double.parseDouble(args[2]);
       double res= Algorithms_util.calcMonthlyPay(principal, years, rate);
       System.out.println("The monthly payment is " + res);
	}
}
