package com.bridgelabz.functionprograms;
import com.bridgelabz.util.FunctionalUtil;
public class flipCoin
	{
       public static void main(String[] args)
		{
			System.out.println("How many times will the coin be flipped? ");
			int flips = FunctionalUtil.inputinteger();
			FunctionalUtil.isFlip(flips);

		}
}