package com.bridgelabz.algorithms;

import com.bridgelabz.util.AlgorithmsUtil;

public class VendingMachine {

	public static void main(String[] args)
	{
	
		int[] change =  {1000,500,100,50,10,2,1};
		
		System.out.println("enter the  money");
		int cash = AlgorithmsUtil.inputinteger();
		AlgorithmsUtil.vendorMachine(change,cash);
	}
}



