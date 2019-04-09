package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.DataStructuresUtil;

public class HashingFunction {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {

		CustomLinkedList<Integer> ds = new CustomLinkedList<>();
		CustomLinkedList<Integer> ds1 = null;

		Map<Integer, CustomLinkedList<Integer>> map = new HashMap<Integer, CustomLinkedList<Integer>>();
		for (int i = 0; i <= 10; i++) {
			ds1 = new com.bridgelabz.util.CustomLinkedList<>();
			map.put(i, ds1);
		}
		FileReader fr = new FileReader("C:\\Users\\Divya\\Desktop\\file.txt");
		BufferedReader br = new BufferedReader(fr);
		int rem;
		String num;
		String delimitor = ",";
		while ((num = br.readLine()) != null) {
			String number[] = num.split(delimitor);
			for (String numb : number) {
				ds.add(Integer.parseInt(numb));
			}
		}
		System.out.println("The numbers in the file are:");
		ds.printList();
		System.out.println();
		int len = ds.size();

		String[] array = new String[len];
		String[] array2 = ds.convArray(array);
		int[] res = ds.convertIntArray(array2);
		int[] sorted = ds.sort(res);

		System.out.println("The sorted array are:");
		for (int s : sorted)
			System.out.print(s + " ");
		System.out.println();
		System.out.println("Diving each number by 11");
		for (int i = 0; i < sorted.length; i++) {
			rem = sorted[i] % 11;
			if (map.isEmpty()) {
				ds1.add(sorted[i]);
				map.put(rem, ds1);
			} else {
				ds1 = map.get(rem);
				if (ds1.size() == 0) {
					ds1.add(sorted[i]);
				} else {
					if (!ds1.search(sorted[i])) {

						ds1.add(sorted[i]);
					}
				}
				map.put(rem, ds1);
			}
		}

		for (int i = 0; i < map.size(); i++) {
			CustomLinkedList<Integer> list = map.get(i);
			System.out.print(i + "--> ");
			list.printList();
			System.out.println();
		}

		br.close();
	}

}
