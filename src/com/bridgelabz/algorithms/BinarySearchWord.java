package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithms_util;

public class BinarySearchWord {

	public static void main(String[] args) {
		System.out.println("Enter the number of Strings");
		int n=Algorithms_util.inputinteger();
		System.out.println("Input the string");
		String str[]= new String[n];
		for(int i=0;i<n;i++){
	        System.out.println("enter the "+i+" String value:");
             Scanner sc= new Scanner(System.in);
             str[i]= sc.nextLine();
		}
		
		Algorithms_util.binarySearchWord(n,str[]);
	}
}
