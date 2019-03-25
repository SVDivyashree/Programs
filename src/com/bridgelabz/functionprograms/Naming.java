package com.bridgelabz.functionprograms;
import com.bridgelabz.util.*;
	public class Naming {
	public static void main(String[] args)
		{
		    
			String user ="Hello <<username>>,How are you?";
			System.out.println("OriginalString:"+user);
			System. out. println("Enter name to be replaced?");
			String user1 = FunctionalUtil.inputString();
			System.out.println(FunctionalUtil.replaces(user,user1));
			
			}
		}





