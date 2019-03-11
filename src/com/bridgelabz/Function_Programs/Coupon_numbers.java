package com.bridgelabz.Function_Programs;

import com.bridgelabz.util.Functional_util;

public class Coupon_numbers
{
	public static void main (String[] args)
	{
        System.out.println("How many coupons do you want to be generated??");
		int n=Functional_util.inputinteger();
		int distinct =Functional_util.isCoupon(n);
	    System.out.println("Distinct count is :" + distinct);
	 }

}
