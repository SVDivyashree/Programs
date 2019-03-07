package com.bridgelabz.Function_Programs;

import com.bridgelabz.util.Functional_util;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		System.out.print("a=");
		int a=Functional_util.inputinteger();
		System.out.print("b=");
		int b=Functional_util.inputinteger();
		System.out.print("c=");
		int c=Functional_util.inputinteger();
		
		Functional_util.findRoot(a, b, c);

	}

}


