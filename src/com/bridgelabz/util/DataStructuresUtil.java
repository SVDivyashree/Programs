package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Random;
import java.util.Set;
import java.io.File;
import java.io.FileWriter;

public class DataStructuresUtil {
	// Take number of random number to generate as input and return array of random
	// number
	public static int[] getRandomArray(int number) 
	{
		Random randomGenerator = new Random();
		int array[] = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = randomGenerator.nextInt();
	}
		return array;
	}

	// Function take String in dd/mm/yyyy format and return Date Object
	public static Date printDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return sdf.parse(date);
		} catch (ParseException pe) {
			return null;
		}
	}

	// format date object in this format 01/12/2016
	public static String getFormatedDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}

	
	
public static void printCalender(int d,int[] days,int month){
	   {
	 for (int i = 0; i < d; i++)
      System.out.print("   ");
  for (int i = 1; i <= days[month]; i++) 
  {
      System.out.printf("%2d ", i);
      if (((i + d) % 7 == 0) || (i == days[month])) 
      System.out.println();
  }
	   }
}
	   public static int Deposit(double amount, int curBalance) 
	   {
			curBalance += amount;
			return curBalance;
		}

		public static int Withdrawal(double amount, int curBalance) {
			curBalance -= amount;
			return curBalance;
		}

		public static void checkBalance(int curBalance) {
			System.out.println("Your current balance is: " + curBalance);
		}
         
		public static boolean isAnagram(String str1,String str2) {
			char[] array1=str1.toCharArray();
			char temp1,temp2;
			char[] array2=str2.toCharArray();
			int len1=str1.length();
			int len2=str2.length();
			if(len1!=len2) {
				return false;
			}
			else{
				for(int i=0;i<len1;i++){
					for(int j=0;j<len1-1;j++){
						if(array1[j]>array1[j+1]){
							temp1=array1[j];
							array1[j]=array1[j+1];
							array1[j+1]=temp1;
						}
					}
				}
				for(int i=0;i<len2;i++){
					for(int j=0;j<len2-1;j++){
						if(array2[j]>array2[j+1]){
							temp2=array2[j];
							array2[j]=array2[j+1];
							array2[j+1]=temp2;
						}
					}
				}
				str1=String.valueOf(array1);
				str2=String.valueOf(array2);
				if(str1.equals(str2))
					return true;
				else
					return false;
			}	
		}
		
		/**
		 *static function to print the prime numbers for the given range
		 * 
		 * @param m the integer that represents the lower bound of the range
		 * @param n the integer that represents the upper bound of the range
		 * @return list of integers that are prime numbers between the range
		 */
		public static List<Integer> primeNumbers(int start,int end) {
			List<Integer> lst=new ArrayList<Integer>();
			int flag=1;
			for(int i=start+2;i<end;i++){
				for(int j=2;j<i;j++){
					if(i%j==0)
					{
						flag=0;
						break;
					}
					else
						flag=1;
				}
				if(flag==1)
				{
					lst.add(i);
				}
			}
			return lst;
		}
		
		
			public static Integer[] sort(Integer[] intArr) {
				Integer temp;
				for(int i=0;i<intArr.length;i++) {
					for(int j=0;j<intArr.length-1;j++) {
						if(intArr[j].compareTo(intArr[j+1])>0) {
							temp=intArr[j];
							intArr[j]=intArr[j+1];
							intArr[j+1]=temp;
						}
					}
				
				
				}
				return intArr;
			}
			public static void fileWriter(String[] sorted,String filename) throws IOException{
				FileWriter fw=new FileWriter(filename);
				for(String str:sorted){
					if(str!=null){
						fw.write(str);
						fw.write(",");
					}
				}
				fw.close();
			}

			
			public static List<Integer> anagramPrime(List<Integer> new_lst){
				List<Integer> listOfAnagrams=new ArrayList<Integer>();
				for(int i=0;i<new_lst.size();i++){
					for(int j=i+1;j<new_lst.size();j++){
						if(DataStructuresUtil.isAnagram(String.valueOf(new_lst.get(i)),String.valueOf( new_lst.get(j)))){
							listOfAnagrams.add(new_lst.get(i));
							listOfAnagrams.add(new_lst.get(j));
							System.out.println(new_lst.get(i)+"  "+new_lst.get(j));
						}
					}
				}
				return listOfAnagrams;
			}

			/**
			 * Function that prints the list of prime numbers that are anagram 
			 * 
			 * @param list of prime numbers that anagram 
			 */
			public static void printPrimeAndAnagram(List<List<Integer>> list)
			{
			    List<Integer> aList = new ArrayList<Integer>();
			    for (int i = 0; i < list.size(); i++) {
			        aList = list.get(i);
			        if (i == 0) {
			            System.out.println("Numbers which are prime and anagram are:"+aList.size());
			            System.out.println();
			            for (int j = 0; j < aList.size(); j++) {
			                System.out.print(aList.get(j) + " ");
			            }
			        } else {
			            System.out.println("Numbers which are prime but not anagram are:"+aList.size());
			            System.out.println();
			            for (int j = 0; j < aList.size(); j++) {
			                System.out.print(aList.get(j) + " ");
			            }
			        }
			        System.out.println();
			    }
			}

}