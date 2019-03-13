package com.bridgelabz.Function_Programs;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import com.bridgelabz.util.Functional_util;

public class StopWatch {

	public static void main(String[] args) {

		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println(elapsed_time+"ns");

	}
}
