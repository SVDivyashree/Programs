package com.bridgelabz.functionprograms;

import com.bridgelabz.util.FunctionalUtil;

public class Coupon_numbers
{
	public static void main (String[] args)
	{
        System.out.println("How many coupons do you want to be generated??");
		int n=FunctionalUtil.inputinteger();
		int distinct =FunctionalUtil.isCoupon(n);
	    System.out.println("Distinct count is :" + distinct);
	 }

}
