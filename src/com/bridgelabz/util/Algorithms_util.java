package com.bridgelabz.util;

import java.util.Arrays;
import java.util.Scanner;
public class Algorithms_util {

	static Scanner scanner=new Scanner(System.in);

	public static int inputinteger() {
		return scanner.nextInt();

	}
	public static String inputString() {
		return scanner.nextLine();
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
	}
	//BinaryInteger
	public static void binInt(int[] array,int n,int key)
	{
		int first = 0;
		int last = n - 1;
		int middle = (first + last)/2;

		while( first <= last )
		{
			if ( array[middle] < key )
				first = middle + 1;    
			else if ( array[middle] == key )
			{
				System.out.println(key + " found at location " + middle  + ".");
				break;
			}
			else
				last = middle - 1;

			middle = (first + last)/2;
		}
		if (first > last)
			System.out.println(key + " isn't present in the list.\n");
	}

	public static void binString(String str, int n, char key)
	{

		char array[]= str.toCharArray();
		int first = 0;
		int last = n - 1;
		int middle = (first + last)/2;


		while( first <= last )
		{
			if ( array[middle] < key )
				first = middle + 1;    
			else if ( array[middle] == key )
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
 
	}


	//BubbleInteger
	public static void bubbleSortInt(int []ar,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println( ar[i]+ " ");
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
	public static void bubbleSortString(String str, int n1) 
	{
		char[]ar=str.toCharArray();
			for(int i=0;i<n1;i++)
			{
				for(int j=0;j<n1-i-1;j++)
				{
					if(ar[j]>ar[j+1])
					{
						char temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
			}
			System.out.println("The sorted elements are:");
			for(int i=0;i<n1;i++)
			{
				System.out.println( ar[i]+ " ");
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
		
		
	}
		
	

