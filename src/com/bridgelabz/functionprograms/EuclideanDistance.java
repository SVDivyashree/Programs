package com.bridgelabz.functionprograms;
import com.bridgelabz.util.FunctionalUtil;
public class EuclideanDistance {

	  public static void main(String[] args) 
	{     	
	    double dis;
	    int x=Integer.parseInt(args[0]);
	    int y=Integer.parseInt(args[1]);
		dis=Math.sqrt((x*x) + (y*y));
 	 	FunctionalUtil.calcDist(x, y); 
 	 	System.out.println("The Euclidean distance is:"+dis);
	}
}


