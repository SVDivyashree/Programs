package com.bridgelabz.algorithms;
import com.bridgelabz.util.Algorithms_util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths; 
import java.util.ArrayList;
import java.util.Collections; 
import java.util.List;
import java.util.Scanner; 

public class BinarySearchWord
{


	public static void main(String[] args)throws Exception 
	{ 
		File file = new File("C:\\Users\\Divya\\Desktop\\words.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
		int i=0;
		String delimitor = ",";
		long size=file.length();
		String[] strr=new String[100];
		String st;
		while ((st = br.readLine()) != null)
		{
			 strr=st.split(delimitor);
		}
		for (String a: strr) {
			if(a!=null)
			System.out.println(a);
		}
		 
		System.out.println("Enter the key to search:");
		String key=Algorithms_util.inputString();
		Algorithms_util.binsearch(strr, key);



	}

}















