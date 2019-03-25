package com.bridgelabz.functionprograms;

import com.bridgelabz.util.FunctionalUtil;

public class Gambler_game {
	 public static void main(String[] args) {
 	
	System.out.println("Enter stake");
    int stake  = FunctionalUtil.inputinteger();
    System.out.println("Enter goal");// gambler's stating bankroll
    int goal   = FunctionalUtil.inputinteger(); 
    System.out.println("Enter trials");// gambler's desired bankroll
    int trials = FunctionalUtil.inputinteger();    // number of trials to perform
    FunctionalUtil.isGamble(stake, goal, trials);
   }

}
