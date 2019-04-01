package com.bridgelabz.datastructures;
import com.bridgelabz.util.Dequeue;
import com.bridgelabz.util.DequeueUtil;
import com.bridgelabz.util.FunctionalUtil;
import com.bridgelabz.util.Node;
import com.bridgelabz.util.NodeDequeue;
import com.bridgelabz.util.AlgorithmsUtil;
import com.bridgelabz.util.CashCounterLogic;
import com.bridgelabz.util.DataStructuresUtil;

public class PalindromeChecker<E> {
	public static void main(String[] args) {
		NodeDequeue<Character> node = new NodeDequeue<Character>();
		System.out.println("Enter a String: ");
		String input = AlgorithmsUtil.inputString();
		// adding each character to the rear of the dequeue
		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);
			node.addRear(character);
		}
		int flag = 0;

		while (node.size > 1) {
			if (node.removeFront() != node.removeRear()) {
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
