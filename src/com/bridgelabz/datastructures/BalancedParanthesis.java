package com.bridgelabz.datastructures;

import com.bridgelabz.util.AlgorithmsUtil;
import com.bridgelabz.util.SinglyLinkedList;
import com.bridgelabz.util.Stack;

public class BalancedParanthesis 
{
	 public static void main(String[] args) throws Exception 
	    {
	        
		    Stack stack = new Stack();
	        System.out.println("Parenthesis Matching Test\n");
	        /* Accepting expression */
	        System.out.println("Enter expression");
	        String exp = AlgorithmsUtil.inputString();        
	        int len = exp.length();
	        System.out.println("\nMatches and Mismatches:\n");
	        for (int i = 0; i < len; i++)
	        {    
	            char ch = exp.charAt(i);
	            if (ch == '(')
					try {
						stack.push(i);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				else if (ch == ')')
	            {
	                try
	                {
	                    int p = stack.pop() + 1;
	                    System.out.println("')' at index "+(i+1)+" matched with ')' at index "+p);
	                }
	                catch(Exception e)
	                {
	                    System.out.println("')' at index "+(i+1)+" is unmatched");
	                }
	            } 
	            while (!stack.isStackEmpty() )
	                System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
	        }
	            	
	        }
	        
	    }


