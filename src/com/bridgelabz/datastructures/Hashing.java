package com.bridgelabz.datastructures;
import com.bridgelabz.util.HashingFunction;
import com.bridgelabz.util.NodeUtil;
import com.bridgelabz.util.OrderedLinkedList;

public class Hashing
{
	private NodeUtil nu;

	{
	  	OrderedLinkedList[] order=new OrderedLinkedList[11];
	  	NodeUtil nu=new NodeUtil();

	  	int[] retArray = nu.integerFileReader();

			for(int i=0; i<retArray.length; i++)
			{
				int rem = retArray[i]%11;
				if(order[rem]== null)
				{
					order[rem] = new OrderedLinkedList();
					NodeUtil.addItem(retArray[i]);
				}
				else
				{
					NodeUtil.addItem(retArray[i]);
					
	            }
			}
			for(int i=0;i<11;i++)
			{
				System.out.println(i);
				if(order[i] !=null)
				{
					NodeUtil.display();
				}
			}
		}

	    public static void main(String[] args)
	    {
	      	Hashing hs=new Hashing();
	      	
	    }
	}



