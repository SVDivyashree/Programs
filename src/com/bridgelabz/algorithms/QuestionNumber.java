package com.bridgelabz.algorithms;

import com.bridgelabz.util.AlgorithmsUtil;

public class QuestionNumber {

	public static void main(String[] args) {
		System.out.println("Think of a number between 0 to 127!");
		int number= AlgorithmsUtil.inputinteger();
		int low=0; int high=127;
        int result=AlgorithmsUtil.find(low,high);
        System.out.println("The guessed number is " + result);
	}
	 
}
