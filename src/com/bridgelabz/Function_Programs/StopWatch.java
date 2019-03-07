package com.bridgelabz.Function_Programs;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import com.bridgelabz.util.Functional_util;

	public class StopWatch {

		public static void main(String[] args)  throws InterruptedException
			{

				long startTime = System.currentTimeMillis();
			    System.out.println("start time=" + startTime);
			    TimeUnit.SECONDS.sleep(10);
			   
			    long endTime = System.currentTimeMillis();
				System.out.println("End time=" + endTime);
				
				 Functional_util.stopWatch(startTime, endTime);
				
			}
	}


