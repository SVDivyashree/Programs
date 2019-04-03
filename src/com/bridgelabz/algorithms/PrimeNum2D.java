package com.bridgelabz.algorithms;
import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.util.DataStructuresUtil;
public class PrimeNum2D
{
    public static void main(String[] args) 
	{
    	List<List<Integer>> outerlist = new ArrayList<List<Integer>>();
		List<Integer> innerlist= new ArrayList<Integer>();
		System.out.println("prime number of the range 0 to 1000");
		int m=2;
		int n=100;
		
		for(int i=1;i<=10;i++)
		{
		innerlist= DataStructuresUtil.primeNumbers(m,n);
		System.out.print("prime no between "+ m +" and "+  n);
		System.out.println(innerlist);
		m+=100;
		n+=100;
		}
    }
	}




