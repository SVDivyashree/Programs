package com.bridgelabz.algorithms;

import com.bridgelabz.util.AlgorithmsUtil;

public class DaysOfWeek {

	public static void main(String[] args) {
        
		Integer month= Integer.parseInt(args[0]);
		
		Integer date= Integer.parseInt(args[1]);
		
		Integer year= Integer.parseInt(args[2]);
		AlgorithmsUtil.dayOfWeek(month,date,year);
		
		
	}

}
