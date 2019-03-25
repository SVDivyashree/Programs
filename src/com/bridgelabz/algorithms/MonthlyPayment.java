package com.bridgelabz.algorithms;

import com.bridgelabz.util.AlgorithmsUtil;

public class MonthlyPayment {

	public static void main(String[] args)
	{
		Double principal= Double.parseDouble(args[0]);
        Double years=Double.parseDouble(args[1]);
        Double rate= Double.parseDouble(args[2]);
       double res= AlgorithmsUtil.calcMonthlyPay(principal, years, rate);
       System.out.println("The monthly payment is " + res);
	}
}
