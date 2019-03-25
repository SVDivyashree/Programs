package com.bridgelabz.functionprograms;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import com.bridgelabz.util.FunctionalUtil;

public class StopWatch {

	public static void main(String[] args) {

		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.stopWatch(startTime, endTime);
		System.out.println(elapsed_time+"ns");

	}
}
