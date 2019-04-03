package com.bridgelabz.datastructures;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.bridgelabz.util.AlgorithmsUtil;
import com.bridgelabz.util.FunctionalUtil;
import com.bridgelabz.util.SinglyLinkedList;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		File file = new File("C:\\Users\\Divya\\Desktop\\file.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];

		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(" ");
		}

		for (String k : array) {
			list.addElement(k);
			System.out.println(k);
		}
		AlgorithmsUtil.bubbleSort(array);
		list.get();
		System.out.println("Enter the key value: ");
		String key = FunctionalUtil.inputString();
		SinglyLinkedList<String> newList = list.searchKey(list, key);
		FileWriter fw = null;
        fw = new FileWriter("C:\\Users\\Divya\\Desktop\\file.txt");
        String data = newList.toString();
        fw.write(data);
		fw.close();

		System.out.println("ordered List -" + data);
	}

}
