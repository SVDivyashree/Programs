package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.util.AlgorithmsUtil;

public class UnorderedList {

	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\Divya\\Desktop\\words.txt"); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 


		String delimitor = ",";
		String[] strr=new String[100];
		String st;
		System.out.println("Enter the key :");
		String key=AlgorithmsUtil.inputString();

		while ((st = br.readLine()) != null)
		{
			strr=st.split(delimitor);
			LinkedList l = new LinkedList(Arrays.asList(strr));
			Iterator iterator = l.iterator();
			System.out.println("The list elements are:");
			for (String a: strr) 
			{
				if(a!=null)
				while (iterator.hasNext()) {
	            // Print element to console
				
	            System.out.println((String) iterator.next());
	            
	            
			}}
		}
	}
}
		
			

		


		/*if(strr==null)
		{

			System.out.println("Read the elements");
			al.add("Ravi");  
			al.add("Vijay");  
			al.add("Raji");  
			al.add("Ajay");  
		}
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());*/  
		
	







