package com.bridgelabz.algorithms;

public class Combined {
	

	    public static void main(String[] args)
	    {
	    	
			int limit=100;
			System.out.print("Palindrome numbers from 1 to N:");
			isPal(limit);
	    }
			public static void isPal(int limit)
			{
			for (int i = 1; i <= limit; i++)
			{
				int n, b, rev = 0;
				n = i;
				while (n > 0)
				{
					b = n % 10;
					rev = rev * 10 + b;
					n = n / 10;
				}
				if (rev == i)
				{
					System.out.println(i);;
				}
				rev = 0;
			}
			
			
	    }
}
	