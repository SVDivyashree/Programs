package com.bridgelabz.Function_Programs;
import com.bridgelabz.util.*;
	public class Naming {
	public static void main(String[] args)
		{
		    
			String user ="Hello <<username>>,How are you?";
			System.out.println("OriginalString:"+user);
			System. out. println("Enter name to be replaced?");
			String user1 = Functional_util.inputString();
			System.out.println(Functional_util.replaces(user,user1));
			
			}
		}





