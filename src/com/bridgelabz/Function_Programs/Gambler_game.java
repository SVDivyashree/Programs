package com.bridgelabz.Function_Programs;

import com.bridgelabz.util.Functional_util;

public class Gambler_game {
	 public static void main(String[] args) {
 	
	System.out.println("Enter stake");
    int stake  = Functional_util.inputinteger();
    System.out.println("Enter goal");// gambler's stating bankroll
    int goal   = Functional_util.inputinteger(); 
    System.out.println("Enter trials");// gambler's desired bankroll
    int trials = Functional_util.inputinteger();    // number of trials to perform
    Functional_util.isGamble(stake, goal, trials);
   }

}
