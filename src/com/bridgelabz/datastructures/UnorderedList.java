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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;


	public class UnorderedList {
		public static void main(String[] args) throws Exception {
			SinglyLinkedList<String> list = new SinglyLinkedList<String>();
			File file = new File("C:\\Users\\Divya\\Desktop\\words.txt");
			BufferedReader bufferreader = new BufferedReader(new FileReader(file));
			String[] array = new String[50];
			String delimitor = " ";
			String st;
					while ((st = bufferreader.readLine()) != null) {
				array = st.split(delimitor);
			}
			for (String k : array) {
				list.addElement(k);
			}
			list.traverse();  
			list.get(); 
			System.out.println("Enter the key value: ");
			String key = AlgorithmsUtil.inputString();
			SinglyLinkedList<String> newList=list.searchKey(list, key);
			     
			 //newList.traverse();
			 FileWriter fw=new FileWriter("C:\\Users\\Divya\\Desktop\\words.txt");    
	         String data = newList.toString();
			 fw.write(data);  
	        
	         fw.close();  
			
	         System.out.println("Unordered List -" + data);
			 }
	}
				
				     
				