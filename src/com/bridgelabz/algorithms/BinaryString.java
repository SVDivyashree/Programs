package com.bridgelabz.algorithms;
import java.lang.reflect.Array;
import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;
public class BinaryString {

	public static void main(String[] args)
	{
		//Binary String
		long startTime = System.nanoTime();
		System.out.println("Enter the String :");
		String str = Algorithms_util.inputString();
		int n1=str.length();
		System.out.println("Enter th key");
		char key1=Algorithms_util.inputChar();
		
		
		Algorithms_util.binString(str, n1,key1);
		long endTime = System.nanoTime();
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println(elapsed_time+"ns");
	}
}
















