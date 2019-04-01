package com.bridgelabz.datastructures;
import java.io.BufferedReader;
import java.util.stream.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import com.bridgelabz.util.AlgorithmsUtil;
import com.bridgelabz.util.DataStructuresUtil;
import com.bridgelabz.util.FunctionalUtil;
import com.bridgelabz.util.Node;
import com.bridgelabz.util.SinglyLinkedList;

public class UnorderedList<T>
{
	
	public static void main(String[] args) throws Exception 
	{
		    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
			File file = new File("C:\\Users\\Divya\\Desktop\\words.txt");
			BufferedReader bufferreader = new BufferedReader(new FileReader(file));
			String[] array = new String[50];
			String delimitor = ",";
			String st;
			while ((st = bufferreader.readLine()) != null) 
			{
				array = st.split(delimitor);
			}
			for (String k : array) 
			{
				if(k!=null)
				list.addElement(k);
			}
			list.traverse(); 
			list.get(st); 
			System.out.println("Enter the key value: ");
			String key = FunctionalUtil.inputString();
			SinglyLinkedList<String> newList=list.searchKey(list, key);
			newList.traverse();
			
			List<String> show = (List<String>) newList.stream();
			
		    
			File file2 = new File("C:\\Users\\Divya\\Desktop\\words.txt");
		    FileWriter fileWriter = new FileWriter(file);
		    BufferedWriter writer = new BufferedWriter(fileWriter);
		    String collect = show.stream().collect(Collectors.joining(","));
		    System.out.println(collect);

		    writer.write(collect);
		    writer.close();

		    
		    
            
		}
      }		
		