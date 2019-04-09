package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmsUtil;
import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.DataStructuresUtil;
import com.bridgelabz.util.FunctionalUtil;
import com.bridgelabz.util.SinglyLinkedList;

public class OrderedList<T> {
      
			
public static void main(String[] args) throws IOException {
		
		//Customized Linked List
		CustomLinkedList<Integer> ds=new CustomLinkedList<>();
		String filename="C:\\Users\\Divya\\Desktop\\file.txt";
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		String number[]=new String[100];
		String num;
		String delimitor=",";
		while((num=br.readLine())!=null){
			number=num.split(delimitor);
		}
		Integer[] intArr=new Integer[number.length];
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=Integer.valueOf(number[i]);
		}
		Integer[] sorted=DataStructuresUtil.sort(intArr);
		System.out.println("The numbers in the file are:");
		for(int numb:sorted){
		ds.add(numb);
		}
		System.out.println("Enter the key :");
		int key = FunctionalUtil.inputinteger();

		boolean res = CustomLinkedList.search(key);
		if (res == true) {
			System.out.println("Element present in the list");
			int index = CustomLinkedList.index(key);
		    CustomLinkedList.remove(index);
			CustomLinkedList.printList();
		} else {
			System.out.println("Element is not present in the list");
			CustomLinkedList.add(key);
			CustomLinkedList.printList();
		}
		FileWriter fw = new FileWriter("C:\\Users\\Divya\\Desktop\\file.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int len = ds.size();
		String[] array = new String[len];
		String[] result = ds.convArray(array);
		for (int i = 0; i < result.length; i++) {
			bw.write(result[i] + " ");
		}

		bw.close();

	
}
}