package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the min range");
		int min=Algorithms_util.inputinteger();
		System.out.println("Enter the max range");
		int max=Algorithms_util.inputinteger();
		System.out.println("The prime numbers in the specified range are");
		Algorithms_util.isPrime(min,max);
		
	}

}
