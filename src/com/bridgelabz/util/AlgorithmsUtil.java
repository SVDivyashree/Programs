package com.bridgelabz.util;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

    public class AlgorithmsUtil<T> {
    static Scanner scanner = new Scanner(System.in);

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

	public static boolean isAnagram(String str1, String str2) {
		String first = str1.replaceAll("\\s", " ");
		String second = str1.replaceAll("\\s", " ");
		if (first.length() != second.length())
			return false;

		char[] s1 = first.toCharArray();
		char[] s2 = second.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		for (int i = 0; i < first.length(); i++) {
			if (s1[i] != s2[i])
				return false;
		}
		return true;

	}
	// Insertion Sort

	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		int i = 0, j = 0, w;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j <= i; j++) {
				if (array[j].compareTo(array[i]) > 0) {
					T temp = array[j];
					array[j] = array[i];
					for (w = i; w > j + 1; w--) {
						array[w] = array[w - 1];
					}
					array[w] = temp;
				}
			}
		}
		for (T kl : array)
			System.out.println(kl + " ");
		System.out.println(" ");
	}

	// BINARY SEARCH
	public static <T extends Comparable<T>> T[] binsearch(T[] array, T key) {
		int arrLength = array.length;
		int first = 0;
		int last = arrLength - 1;
		int middle = (first + last) / 2;
		while (first <= last) {

			if (key.compareTo(array[middle]) > 0) {

				first = middle + 1;

			} else if (array[middle].equals(key)) {

				System.out.println(key + " found at location " + middle);
				break;
			} else
				last = middle - 1;
			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(key + " isn't present in the list.\n");
		return array;
	}

	// MONTHLY PAYMENT
	public static double calcMonthlyPay(Double principal, Double years, Double rate) {
		{
			double n = 12 * years;
			double r = rate / (12 * 100);
			double pow = Math.pow(1 + r, -n);
			double payment = (principal * r) / 1 - pow;
			return payment;
		}

	}

	// SQUARE ROOT
	public static double SquareRoot(int c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - (c / t)) > epsilon * t) {
			t = ((c / t) + t) / 2;
		}
		return t;
	}

	// TEMPERATURE CONVERSION
	public static double tempConversion(double temperature, int choice) {
		switch (choice) {
		case 1:
			double Fahrenheit = (temperature * 9 / 5) + 32;
			System.out.println(Fahrenheit + "F");
		case 2:
			double Celsius = (temperature - 32) * 5 / 9;
			System.out.println(Celsius + "C");
		default:
			break;
		}
		return 0;
	}

	// BUBBLE SORT
	public static <T extends Comparable<T>> void bubbleSort(String[] strArray) 
	{
		System.out.println("Enter number of elements"); 
		int n = AlgorithmsUtil.inputinteger();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (strArray[j + 1].compareTo(strArray[j]) < 0) {
					String temp = strArray[j];
					strArray[j] = strArray[j + 1];
					strArray[j + 1] = temp;
				}
			}

		}
		System.out.println("The sorted elements are :");
		for (String k : strArray) {
			System.out.println(k + " ");
		}
	}

	// DAY OF THE WEEK
	public static int dayOfWeek(Integer month, Integer date, Integer year) {
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0= month + 12 * ((14 - month) / 12) - 2;
		int day = (date + x + (31 * m0) / 12) % 7;
		System.out.println("Day of the week" + " " + day);
		return day;
	}

	// DECIMAL TO BINARY CONVERSION
	public static void decToBinary(int n) {

		// array to store binary number
		int[] binaryNum = new int[1000];

		// counter for binary array
		int i = 0;
		while (n > 0) {
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

	public static boolean isPowerOfTwo(int res) {
		return (int) (Math.ceil((Math.log(res) / Math.log(2)))) == (int) (Math.floor(((Math.log(res) / Math.log(2)))));
	}

	// MERGESORT

	public static void merge(String[] array) {
		if (array.length >= 2) {
			String left[] = new String[array.length / 2];
			String right[] = new String[array.length - (array.length / 2)];
			for (int i = 0; i < left.length; i++) {
				left[i] = array[i];
			}
			for (int j = 0; j < right.length; j++) {
				right[j] = array[j + (array.length / 2)];
			}
			merge(left);
			merge(right);
			mergeSort(array, left, right);
		}
	}

	// MergeSort
	public static void mergeSort(String[] array, String[] left, String[] right) {
		int a = 0, b = 0;
		for (int i = 0; i < array.length; i++)
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				array[i] = left[a];
				a++;
			} else {
				array[i] = right[b];
				b++;
			}

	}

	// Guess the Number
	public static int find(int low, int high) {
		int mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("Enter 1 if the number is between" + low + " - " + mid + "\nEnter 2 if number is between"
					+ (mid + 1) + "-" + high);
			int c = AlgorithmsUtil.inputinteger();
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void isPrime() {

		System.out.println("Enter the min range");
		int min = AlgorithmsUtil.inputinteger();
		System.out.println("Enter the max range");
		int max = AlgorithmsUtil.inputinteger();
		System.out.println("The prime numbers are :");
		int i, count;
		List<Integer> list = new ArrayList<Integer>();
		while (min <= max) {
			count = 0;
			i = 2;
			// Divisors always lies between 0 to (number/2)
			while (i <= min / 2) {
				if (min % i == 0) {
					count++;
					break;
				}
				i++;
			}
			if (count == 0 && min != 1)
				list.add(min);

			min++;
		}
		for (int k : list) {
			System.out.print(k + " ");
		}
	}

	public static boolean isPalindrome(int k) {
		int temp = k;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == k) {
			return true;
		}
		return false;
	}

	public static void vendorMachine(int[] change, int cash) {
		{
			int result = 0, rem, i = 0, total = 0;
			if (cash == 0)
				return;
			else {
				if (cash >= change[i]) {
					result = cash / change[i];

					rem = cash % change[i];
					cash = rem;
					total = total + result;
					System.out.println(change[i] + "  notes-->" + result);
				}

			}
			i++;
		}
	}

	
		public static <T extends Comparable<T>> void BubbleSortList(LinkedList<String> list) 
		{
			int i;
			int n = list.size();
			for (i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - i - 1; j++) {
					if ((list.get(j)).compareTo(list.get(j+1)) > 0) {
						String temp=list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, temp);
						
					}
				}
			}
			for(String kl:list)
				System.out.println(kl + " ");
		}


public static  LinkedList<String> binarySearchList(LinkedList<String> list, String key) {
		
		int low = 0, high = list.size()-1, mid = 0;
		mid = (low + high) / 2;
		while (low <= high) {
			if (key.compareTo(list.get(mid)) > 0)
				low = mid + 1;
			else if (list.get(mid).equals(key)) {
				System.out.println("key element found at index " + mid);
				list.remove(mid);
				break;
			} else
				high = mid - 1;

			mid = (low + high) / 2;
		}
		if (low > high) {
			System.out.println("key element not found");
			list.add(mid, key);
		}
	return list;	
	}
}

