package com.bridgelabz.util;

import java.util.Iterator;

public class SinglyLinkedList<T extends Comparable<T>> {

	private static Node head;
	private static Node tail;
	private static int size = 0;
	private Node key;
	private int length;
	static String[] str = new String[100];
	static SinglyLinkedList newList = new SinglyLinkedList();

	public static boolean isEmpty() {
		return head == null;
	}

	public static String addElement(String key) {
		Node nd = new Node();
		nd.setData(key);
		size++;

		/**
		 * check if the list is empty
		 */
		if (isEmpty()) {
			// since there is only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		} else {
			// set current tail next link to new node
			tail.setNext(nd);
			// set tail as newly created node
			tail = nd;
		}
		return null;
	}
	

	public static void traverse() {

		Node tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}

	}
	 
	public static boolean search(String x) {
		Node current = head; // Initialize current
		while (current != null) {
			if (current.getData().equals(x))
				return true;
			   // data found
			current = current.getNext();
		}
		return false; // data not found
	}
	public static  int index(String data) {
		Node curr = head;
		int count = 0;
		while (curr != null) {
			if (curr.getData().equals(data)) {
				curr.getNext();
				return count;
			}
			count++;
			curr = curr.getNext();
		}
		assert (false);
		return 0;
	}
 public static void deleteNode(int position) 
{ 
    // If linked list is empty 
    if (head == null) 
        return; 

    // Store head node 
    Node temp = head; 

    // If head needs to be removed 
    if (position == 0) 
    { 
        head = temp.next; // Change head 
        return; 
    } 

    // Find previous node of the node to be deleted 
    for (int i=0; temp!=null && i<position-1; i++) 
        temp = temp.next; 

    // If position is more than number of ndoes 
    if (temp == null || temp.next == null) 
        return; 

    // Node temp->next is the node to be deleted 
    // Store pointer to the next of node to be deleted 
    Node next = temp.next.next; 

    temp.next = next;  // Unlink the deleted node from list 
}
 public static String[] convArray(String[] array) {
		Node tnode = head;
		int i = 0;
		while (tnode != null) {
			array[i] = String.valueOf(tnode.getData());
			tnode = tnode.getNext();
			i++;
		}
		return array;
	}


	public static int size() {
		Node tnode = head;
		int len = 0;
		while (tnode != null) {
			len++;
			tnode = tnode.getNext();
		}
		return len;
	
	}

	public static int[] convertIntArray(String[] arr) {
			int[] arrInt = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arrInt[i] = Integer.valueOf(arr[i]);
			}
			return arrInt;
		}

	
		public static int[] sort(int[] array) {
			int temp;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - 1; j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			return array;
		}

		public static void add(int i)
		{
			Node nd = new Node();
            nd.setData(i);
            System.out.println("Adding: " + i);
				if (isEmpty()) {
					head = nd;
					tail = nd;
				} else {

					// Function call to set the data present in Node class
					// of com.bridgelabz.datastructureprograms
					tail.setNext(nd);
					tail = nd;
				}
			}
			
		}
	
		

