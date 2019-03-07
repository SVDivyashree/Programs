package com.bridgelabz.Function_Programs;

import com.bridgelabz.util.Functional_util;

public class Coupon_numbers
{
	public static void main (String[] args)
	{
        System.out.println("How many coupons do you want to be generated??");
		int n=Functional_util.inputinteger();
		System.out.println("Distinct coupon numbers are:");
	
	    Functional_util.isCoupon(n);
	    
	

	}

}
