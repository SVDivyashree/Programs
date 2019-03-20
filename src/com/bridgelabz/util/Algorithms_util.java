package com.bridgelabz.util;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
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
		}
		return true;
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
	//Insertion Sort
public static <T extends Comparable<T>> void insertionSort(T[] array,T key)
	{
	for (int j = 1; j < array.length; j++) {  
        key = array[j];
		int i = j - 1;
		while (i >= 0) {
			if (key.compareTo(array[i]) > 0) {
				break;
			}
			array[i + 1] = array[i];
			i--;
		}
		array[i + 1] = key;
	}

for(T k: array)
{
	System.out.println(k + " ");
}
			}
//BINARY SEARCH
	public static <T extends Comparable<T>> T[] binsearch(T[] array,T key)
	{
    
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
			else if ( array[middle].equals(key))
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
	//SQUARE ROOT
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
	//TEMPERATURE CONVERSION
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

		//Binary Search for words
	public static int binarySearchWord(List<String> words, int n, String key)
	{
		int first=0;
		int last=n-1;
		int mid =(first+last)/2;

		while(first<=last)
		{
			if(key.compareTo(words.get(mid))>0)
			{
				first=mid+1;
			}
			else if(words.get(mid).equals(key))
			{
				System.out.println("The key is found at location :" + mid);
				break;
			}
			else if(key.compareTo(words.get(mid))<0)
				last = mid - 1;
			mid = (first + last)/2;
		}
		if (first > last)
			System.out.println(key + " isn't present in the list.\n");
		return mid ;
	}

	//BUBBLE SORT
	public static <T extends Comparable<T>> void bubbleSort(T[] array,int n) 
	{

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j+1].compareTo(array[j])<0)
				{
					T temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}

		}
		System.out.println("The sorted elements are :");
		for(T k :array)
		{
			System.out.println(k + " ");
		}
		}
		
	
		
	//VENDOR MACHINE
	public static void vendorMachine(int[] change,int cash)
	{
		for(int i=change.length-1;i>=0;i--)
		{
			int count=0;
			if(cash==0)
				return;
			else 
			{
				if(cash>=change[i])
				{
					count=cash/change[i];
					System.out.println(change[i]+" notes:"+count);
					cash=cash-(count*change[i]);
				}
			} 

		}

	}
	public static void dayOfWeek(Integer month, Integer date, Integer year)
	{
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 -y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) -2;
		int day  = (date + x + (31 * m0) / 12) % 7;
		System.out.println("Day of the week" +" " + day);
	}
	//DECIMAL TO BINARY CONVERSION
	public static void decToBinary(int n) {

		// array to store binary number 
		int[] binaryNum = new int[1000]; 

		// counter for binary array 
		int i = 0; 
		while (n > 0)  
		{ 
			// storing remainder in binary array 
			binaryNum[i] = n % 2; 
			n = n / 2; 
			i++; 
		} 

		// printing binary array in reverse order 
		for (int j = i - 1; j >= 0; j--) 
			System.out.print(binaryNum[j]); 
	}
	public static int swapNibbles(int x) {
		{ 
			return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
		}
	}

	public static boolean isPowerOfTwo(int res)
	{
		return (int)(Math.ceil((Math.log(res) / Math.log(2)))) ==  
				(int)(Math.floor(((Math.log(res) / Math.log(2))))); 
	}

	//MERGESORT 

	public static void merge(String[] array)
	{
		if (array.length>=2)
		{
			String left[]= new String[array.length/2];
			String right[]= new String[array.length-(array.length/2)];
			for( int i=0;i<left.length;i++)
			{
				left[i]= array[i];
			}
			for( int j=0;j<right.length;j++)
			{
				right[j]= array[j+(array.length/2)];
			}
			merge(left);
			merge(right);
			mergeSort(array,left,right);		
		}
	}
	//MergeSort
	public static void mergeSort(String[] array, String[] left, String[] right)
	{
		int a=0,b=0;
		for(int i=0;i<array.length;i++)
			if(b>=right.length ||
			(a< left.length && left[a].compareToIgnoreCase(right[b])<0))
			{
				array[i]=left[a];
				a++;
			}
			else
			{

				array[i]=right[b];
				b++;	
			}
		for(String str:array)
		 {
			 System.out.println(array);
		 }
	}
	//Guess the Number
	public static int find(int low, int high)
	{
		int mid;
		while(low!=high)
		{
			mid=(low+high)/2;
			System.out.println("Enter 1 if the number is between" + low + " - "+ mid +
					           "\nEnter 2 if number is between" +(mid+1) + "-" + high);
			int c=Algorithms_util.inputinteger();
			if(c==1)
				high=mid;
			else
				low=mid+1;
		}
		return low;
		}
	public static void binsearch(FileReader fr, String key) {
		
		
	}
		
	}
 



























