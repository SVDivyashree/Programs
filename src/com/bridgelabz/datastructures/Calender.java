package com.bridgelabz.datastructures;
import java.util.Scanner;
import com.bridgelabz.util.AlgorithmsUtil;
import com.bridgelabz.util.FunctionalUtil;
import com.bridgelabz.util.DataStructuresUtil;
public class Calender 
{
	public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);    
        int year = Integer.parseInt(args[1]);     
        String[] months = { "",                               
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };

        // days[i] = number of days in month i
        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        if(month==2)
        FunctionalUtil.leapYear(year);
        days[month]=29;

        

        // print calendar header
        System.out.println("   " + months[month] + " " + year);
        System.out.println(" S  M Tu  W Th  F  S");

        // starting day
        int d = AlgorithmsUtil.dayOfWeek(month, 1, year);

        // print the calendar
       DataStructuresUtil.printCalender(d,days,month);
    }
}
