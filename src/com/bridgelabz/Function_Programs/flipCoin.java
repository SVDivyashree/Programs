package com.bridgelabz.Function_Programs;
import com.bridgelabz.util.Functional_util;
public class flipCoin
	{
       public static void main(String[] args)
		{
			System.out.println("How many times will the coin be flipped? ");
			int flips = Functional_util.inputinteger();
			Functional_util.isFlip(flips);

		}
}