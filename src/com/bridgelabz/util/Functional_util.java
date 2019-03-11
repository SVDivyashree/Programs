package com.bridgelabz.util;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Functional_util {
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
	//CouponNumbers 
	
	
		





	//flipCoin	
	public static void isFlip(int flips) {
		int counter=0;
		double tails=0.0;
		double heads=0.0;
		if(flips>0)

			while(counter <= flips)
			{
				double randNum = Math.random();//to read values between 0 and 1

				if(randNum < .5)
				{
					tails++;

				}
				else
				{
					heads++;
				}
				counter++;      

				System.out.println("Number of Heads = " + heads);

				double per1= ((heads/flips)*100);
				System.out.println("heads per ="+ per1+"%");
				System.out.println("Number of Tails = " + tails);
				double per= ((tails/flips)*100);
				System.out.println("tails per ="+ per+"%");
			}
	}
	//To find Prime factors using Brute-force
	public static void primeFactors(int n) 
	{ 
		while (n%2==0) 
		{ 
			System.out.print(2 + " "); 
			n /= 2; 
		}  

		// n must be odd at this point.  So we can 
		// skip one element (Note i = i +2) 
		for (int i = 3; i*i <= n; i+= 2) 
		{ 
			// While i divides n, print i and divide n 
			while (n%i == 0) 
			{ 
				System.out.print(i + " "); 
				n /= i; 
			} 
		} 
		if (n > 2) 
			System.out.print(n); 
	}
	//Power of 2
	public static void isPower(int n) {

		int i = 0;
		int power = 1;

		System.out.println("Powers of 2 that are less than or equal to 2^"+n);
		if(n<31)
		{
			while (i <= n)
			{
				System.out.println("2^"+i+" = " + power);
				power = power * 2;
				i++;
			}
		}

	}
	//Leap year program
	public static void leapYear(int year){
		if(year>=1000)
		{
			if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
				System.out.println("The given year is a leap year");
			else
				System.out.println("The given year is not a leap year");
		}
		else {
			System.out.println("Invalid input");
		}
	}

	//Harmonic series
	public static void seriesHarmonic(int N)
	{
		float sum=0;
		if(N!=0)
		{
			int i=1;
			while(i<N)
			{
			 sum=sum+(float)1/i;
			 i++;
				
			}
            System.out.println(sum);
		}
			}
		
	


	//Gambler game
	public static void isGamble(int stake,int goal,int trials)
	{
		int bets = 0;
		int wins = 0;
		for (int t = 0; t < trials; t++)
		{

			// do one gambler's ruin simulation
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++;     // win $1
				else                     
					cash--;

			}
			if (cash == goal) wins++; // did gambler go achieve desired goal?

		}

		// print results
		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);

		System.out.println("Avg # bets           = " + 1.0* bets / trials);
	}


	//Quadratic Equations

	public static void findRoot(int a,int b,int c)
	{
		int delta=(b*b)-(4*a*c);
		if(delta>0)
		{
			double	root1= (-b+Math.sqrt(delta))/(2*a);
			double	root2= (-b-Math.sqrt(delta))/(2*a);
			System.out.println("Roots are distinct"+" "+ "root1 =" + root1 + "root2 ="+ root2);
		}
		else if(delta==0)
		{
			double root3= (-b)/(2*a);
			double root4= root3;
			System.out.println("Roots are equal"+""+ "root ="+root3);
		}
		else if(delta<0)
		{
			double real= (-b)/(2*a);
			double imaginary= Math.sqrt(-delta)/(2*a);
			System.out.println("Roots are real and imaginary");
			System.out.println(real+"+i"+imaginary);
			System.out.println(real+"-i"+imaginary);
		}
	}
	//Stop Watch
	public static long stopWatch(long startTime,long endTime)
	{

		long timeElapsed = endTime - startTime;
		return timeElapsed;
	}

	//Two Dimensional Array
	public static void twoDArray(int a,int b)
	{
		int c[][]= new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				c[i][j]=Functional_util.inputinteger();	
			}
		}
		System.out.println();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
	// Sum of triplets equal to zero

	public static void isTriplet(int[] a, int n, int sum) {
		int i,j,k;
		for(i=0;i<n-2;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				for(k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
						System.out.println("["+a[i]+" " +a[j]+ " " + a[k]+"]");

				}
			}
		}


	}
	//EUCLIDEAN DISTANCE


	public static double calcDist(double x, double y) {
		{

			double dis = Math.sqrt((x*x)+(y*y));
			return dis;
		}

	}
	//WINDCHILL
	public static void isTemperature(double t, double v)
	{
		double w= 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Wind chill  = " + w);
	}
	//Replace string
	public static String replaces(String user, String user1) 
	{
		final String str = "<<username>>";
		Pattern p =Pattern.compile(str);
		Matcher m= p.matcher(user);
		String res= m.replaceFirst(user1);
		return res;
	}
	// Permutation of Strings
	public static String permutations(String str, int l,int r)
	{
		if (l==r) {
			System.out.println(str);
		}
		else {
		for (int i = l; i <= r; i++)
		{
			str=swap(str, l, i);
			permutations(str, l+ 1, r);
			str=swap(str, l, i);
		}
		}
		return str;
	}
		
			// Utility function to swap two characters in a character array
			private static String swap(String a, int i, int j)
			{
				char temp ;
				char[] charArray= a.toCharArray();
				temp=charArray[i];
				charArray[i]=charArray[j];
				charArray[j]=temp;
				return String.valueOf(charArray);
			
			}
// COUPON
			public static int isCoupon(int n)
			{
				int count=0;
				int i=0;
				int j=0;
				int a[]=new int[n];
				Random t= new Random();
				
		        for( i=0;i<n;i++)
				{
		        	a[i]=t.nextInt(n);
		        	 System.out.println(a[i] + " ");
				}
		       
		        System.out.print("Distinct coupons:");
		       for( i=0;i<n;i++)
		       {
		    	   for( j=0;j<i;j++)
		    	       if(a[i]==a[j])
		    		    	break;
		    		    if(i==j)
		    		        count++;
		       }
		       
			return count;
			}

}



