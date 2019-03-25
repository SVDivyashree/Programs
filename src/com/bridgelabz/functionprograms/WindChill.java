package com.bridgelabz.functionprograms;

import com.bridgelabz.util.FunctionalUtil;

public class WindChill
{
	public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        FunctionalUtil.isTemperature(t, v);
       
       
    }

}
