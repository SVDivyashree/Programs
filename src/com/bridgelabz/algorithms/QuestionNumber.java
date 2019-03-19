package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;

public class QuestionNumber {

	public static void main(String[] args) {
		System.out.println("Think of a number between 0 to 127!");
		int number= Algorithms_util.inputinteger();
		int low=0; int high=127;
        int result=Algorithms_util.find(low,high);
        System.out.println("The guessed number is " + result);
	}
	 
}
