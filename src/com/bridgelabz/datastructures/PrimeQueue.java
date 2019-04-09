package com.bridgelabz.datastructures;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.DataStructuresUtil;
import com.bridgelabz.util.Queue;

public class PrimeQueue {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		// Customized Queue
		Queue<Integer> queue = new Queue<>();
		list = DataStructuresUtil.primeNumbers(0, 1000);
        for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) 
			{
              if (DataStructuresUtil.isAnagram(String.valueOf(list.get(i)), 
						String.valueOf(list.get(j)))) {

					queue.insert(list.get(i));
					queue.insert(list.get(j));
				}
			}
		}
		System.out.println("Elements in a queue are :");
        queue.display();
	}
}
