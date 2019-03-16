package com.bridgelabz.util;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithms_util<T> {
	static Scanner scanner=new Scanner(System.in);

	public static int inputinteger() {
		return scanner.nextInt();

	}
	public static String inputString() {
		return scanner.next();
	}

	public static double inputDouble() {
		return scanner.nextDouble();
	}
	public static char inputChar() {
		return scanner.next().charAt(0);
	}

	public static boolean areAnagram(String str1,String str2) 
	{ 
		// Get lengths of both strings 
		int n1 = str1.length(); 
		int n2 = str2.length(); 

		// If length of both strings is not same, 
		// then they cannot be anagram 
		if (n1 != n2) 
		{
			return false;
		}
		char[] s1= str1.toCharArray();
		char[] s2= str2.toCharArray();

		// Sort both strings 
		Arrays.sort(s1); 
		Arrays.sort(s2); 

		// Compare sorted strings 
		for (int i = 0; i < n1; i++) 
		{
			if (s1[i] != s2[i]) 
			{
				return false; 

			}

			return true; 

		}
		return false;
	} 
	//Prime numbers
	public static void isPrime(int min, int max)
	{
		int num=min;
		while(num<=max)
		{
			int count=0;
			int i=2;
			while(i<=num/2)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
				i++;
			}
			if(count==0 && num!=1)
				System.out.println(num);
			num++;
		}
	}


	//BinaryInteger
	//	public static void binInt(int[] array,int n,int key)
	//	{
	//		int first = 0;
	//		int last = n - 1;
	//		int middle = (first + last)/2;
	//
	//		while( first <= last )
	//		{
	//			if ( array[middle] < key )
	//				first = middle + 1;    
	//			else if ( array[middle] == key )
	//			{
	//				System.out.println(key + " found at location " + middle  + ".");
	//				break;
	//			}
	//			else
	//				last = middle - 1;
	//
	//			middle = (first + last)/2;
	//		}
	//		if (first > last)
	//			System.out.println(key + " isn't present in the list.\n");
	//	}

	

	//BubbleInteger
	public static void bubbleSortInt(Integer[] array,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println( array[i]+ " ");
		}
	}
	//Insertion Sort
	public static void InsertionSort(int[] ar, int n) {

		for (int j = 1; j < n; j++) {  
			int key = ar[j];  
			int i = j-1;  
			while ( (i > -1) && ( ar[i] > key ) ) {  
				ar [i+1] = ar [i];  
				i--;  
			}  
			ar[i+1] = key;  
		}  
		for(int i:ar){    
			System.out.print(i+" ");    
		}    
		System.out.println();    

	}
	public static void bubbleSortString(String[] array, int n1) 
	{
		
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n1-i-1;j++)
			{
				if(array[j].compareToIgnoreCase(array[j+1]) > 0)
				{
					String temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted elements are:");
		for(int i=0;i<n1;i++)
		{
			System.out.println( array[i]+ " ");
		}
	}
	public static void insertSortString(String str, int n)
	{
		char ar[]=str.toCharArray();
		for (int j = 1; j < n; j++) {  
			char key = ar[j];  
			int i = j-1;  
			while ( (i > -1) && ( ar[i] > key ) ) {  
				ar [i+1] = ar [i];  
				i--;  
			}  
			ar[i+1] = key;  
		}  

		for(int i:ar){    
			System.out.print(i+" ");    
		}    
		System.out.println();    

	}

	public static <T extends Comparable<T>> T[] search(T[] array,T key) {
		
		int arrLength=array.length;
		int first = 0;
		int last = arrLength - 1;
		int middle = (first + last)/2;
		while( first <= last )
		{
			
			if (key.compareTo(array[middle])> 0)
			{
				
            first = middle + 1;  
				
			}
			else if ( array[middle].equals(key ))
			{
				
				System.out.println(key + " found at location " + middle);
				break;
			}
			else
				last = middle - 1;
			    middle = (first + last)/2;
		}
		if (first > last)
			System.out.println(key + " isn't present in the list.\n");
		return array;
	}
	//	MONTHLY PAYMENT
	public static double calcMonthlyPay(Double principal, Double years, Double rate) {
		{
			double n=12*years;
			double r= rate/(12*100);
			double pow=Math.pow(1+r,-n);
			double payment= (principal*r)/1-pow;
			return payment;
		}
		
		
	}
	public static double SquareRoot(int c)
	{
		double t=c;
		double epsilon=1e-15;
		while(Math.abs(t-(c/t))>epsilon*t)
		{
			t=((c/t)+t)/2;
		}
		return t;
	}
	public static double tempConversion(double temperature,int choice) 
	{
		switch(choice)
		{
	    case 1:
		double Fahrenheit= (temperature * 9/5) + 32;
		System.out.println(Fahrenheit + "F");
	    case 2:
		double Celsius= (temperature - 32) * 5/9;
		System.out.println(Celsius + "C"); 
		default:
			break;
	}
		return 0;
	}
}







