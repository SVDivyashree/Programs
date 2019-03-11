package com.bridgelabz.Function_Programs;
import com.bridgelabz.util.Functional_util;
public class EuclideanDistance {

	  public static void main(String[] args) 
	{     	
	    double dis;
	    int x=Integer.parseInt(args[0]);
	    int y=Integer.parseInt(args[1]);
		dis=Math.sqrt((x*x) + (y*y));
 	 	Functional_util.calcDist(x, y); 
 	 	System.out.println("The Euclidean distance is:"+dis);
	}
}


