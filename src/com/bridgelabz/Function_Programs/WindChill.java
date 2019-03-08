package com.bridgelabz.Function_Programs;

import com.bridgelabz.util.Functional_util;

public class WindChill
{
	public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        Functional_util.isTemperature(t, v);
       
       
    }

}
