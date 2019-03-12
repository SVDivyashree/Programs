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
		int count,n,i;
	for (n =min;n<=max; n++) 
	{  
		count=0;
		
		for(i=2;i<=n/2;i++)
		{
				if (n% i== 0)
				{  
					count++;
					break;
				}  
		}
			if(count==0 && n!=1)
			{   
				
				System.out.println(n);
				
			}
	}
	
	}
}



