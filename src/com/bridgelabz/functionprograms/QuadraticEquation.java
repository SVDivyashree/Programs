package com.bridgelabz.functionprograms;

import com.bridgelabz.util.FunctionalUtil;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		System.out.print("a=");
		int a=FunctionalUtil.inputinteger();
		System.out.print("b=");
		int b=FunctionalUtil.inputinteger();
		System.out.print("c=");
		int c=FunctionalUtil.inputinteger();
		
		FunctionalUtil.findRoot(a, b, c);

	}

}


