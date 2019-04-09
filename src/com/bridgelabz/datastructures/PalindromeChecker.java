package com.bridgelabz.datastructures;

import com.bridgelabz.util.AlgorithmsUtil;
import com.bridgelabz.util.Dequeue;

	public class PalindromeChecker {
		public static void main(String[] args) {
        Dequeue<Character> dequeue=new Dequeue<Character>();
        System.out.println("Enter a String: ");
		String input = AlgorithmsUtil.inputString();
           for (int i = 0; i < input.length(); i++) {
				char character = input.charAt(i);
				dequeue.addRear(character);
			}
			int flag = 0;

			while (dequeue.size > 1) {
				if (dequeue.removeFront() !=dequeue.removeRear()) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println("String is palindrome");
			} else {
				System.out.println("String is not palindrome");
			}
		}

	}

