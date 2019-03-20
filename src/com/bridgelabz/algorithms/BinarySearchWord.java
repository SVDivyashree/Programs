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
		  String path= Paths.get("C:\\Users\\Divya\\Desktop\\words.txt").toString();
	  File file = new File(path); 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	
  
	  String st; 
	  while ((st = br.readLine()) != null) 
	    System.out.println("Strings are  " + st); 
	

	 
	  System.out.println("Enter the key to search:");
	  String key=Algorithms_util.inputString();

	  
	    
	    }
	  
}

  




	








