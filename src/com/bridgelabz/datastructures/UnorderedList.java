package com.bridgelabz.datastructures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.bridgelabz.util.FunctionalUtil;
import com.bridgelabz.util.Node;
import com.bridgelabz.util.SinglyLinkedList;

public class UnorderedList {
	public static void main(String args[]) throws IOException {
		String content = new String();
		File file = new File("C:\\Users\\Divya\\Desktop\\words.txt");
	    SinglyLinkedList<String> list= new SinglyLinkedList<>();
		try {
			Scanner sc = new Scanner(new FileInputStream(file));
			while (sc.hasNextLine()) {
				content = sc.nextLine();
				String[] contents = content.split(" ");
				for (String string : contents) 
				{
					SinglyLinkedList.addElement(string);
					System.out.println(string);
				}

			}
			sc.close();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nProgram terminated Safely...");
		}
		System.out.println("Enter the key :");
		String key = FunctionalUtil.inputString();

		boolean res = SinglyLinkedList.search(key);

		if (res == true) {
			System.out.println("Element present in the list");
			int index = SinglyLinkedList.index(key);

			SinglyLinkedList.deleteNode(index);
			SinglyLinkedList.traverse();
		} else {
			System.out.println("Element is not present in the list");
			SinglyLinkedList.addElement(key);
			SinglyLinkedList.traverse();
		}
		FileWriter fw = new FileWriter("C:\\Users\\Divya\\Desktop\\words.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int len = list.size();
		String[] array = new String[len];
		String[] result = list.convArray(array);
		for (int i = 0; i < result.length; i++) {
			bw.write(result[i] + " ");
		}
		
//		Node st = list.traverse();
//		System.out.println(st);
		bw.close();

	}

}
