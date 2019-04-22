package com.bridgelabz.common.util;

import java.util.Iterator;
import java.util.Scanner;

import com.bridgelabz.util.Node;

public class CustomLinkedList<E> implements Iterable<E> {
	private Node<E> head;
	private Node<E> tail;

	public CustomLinkedList() {
		head = null;
	}

	static Scanner s = new Scanner(System.in);

	public static int userInt() {
		return s.nextInt();
	}

	public static double userDouble() {
		return s.nextDouble();
	}

	public static boolean userBoolean() {
		return s.nextBoolean();
	}

	public static String userString() {
		return s.next();
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void add(E share) {
		Node<E> nd = new Node<>();
		nd.setData(share);
		System.out.println(share);
		if (isEmpty()) {
			head = nd;
			tail = nd;
		} else {
			tail.setNext(nd); // tail.setNext(nd);
			tail = nd;
		}
	}

	public E get(int index) {
		Node<E> temp = head;
		int i = 0;
		while (i != index) {
			temp = temp.getNext();
			i++;
		}
		return temp.getData();
	}

	public int search(String data) {
		Node<E> temp = head;
		int i = 0;
		while (!temp.getData().equals(data)) {
			temp = temp.getNext();
			i++;
			// while (temp.getnext() != null) {
			/*
			 * if (temp.getData().equals(data)) { return i; } temp = temp.getnext();
			 * i++;
			 */
		}
		return i;
	}

	public int index(E data) {

		/*
		 * Node<T> curr = head; int count = 0; while (curr != null) { if
		 * (curr.getData().equals(data)) { //curr.getnext(); return count; } else
		 * count++; curr = curr.getnext(); } //assert (false);
		 * 
		 * return count;
		 */

		Node<E> node = head;
		System.out.println("NODE=" + node.getData().toString());

		for (int i = 0; i < size(); i++) {
			System.out.println("*qqqqq" + node.getData());
			if (node.getData().equals(data)) {
				System.out.println("found");
				return i;
			}
			node = node.next;
			// System.out.println("refference node="+node.toString());
		}

		return -1;
	}

	/**
	 * Function to remove the element of the specified index
	 * 
	 * @param index the index of an element which is needed to be deleted
	 * @return
	 */
	public void remove(int index) {
		if (isEmpty())
			return;
		Node<E> temp = head;
		if (index == 0) {
			head = temp.getNext();
			return;
		}
		for (int i = 0; temp != null && i < index - 1; i++) {
			temp = temp.getNext();
		}
		if (temp == null || temp.getNext() == null)
			return;
		Node<E> next = temp.getNext().getNext();

		temp.setNext(next);
	}

	/*
	 * public void remove(E element) { Node<E> temp = head; if
	 * (temp.getData().equals(element)) { head = temp.getnext(); } while (temp
	 * != null) { Node<E> next = temp.getnext(); if (next != null &&
	 * next.getData().equals(element)) { temp.setnext(next.getnext());
	 * } temp = temp.getnext(); } }
	 */
	public void remove(E data) {
		// Store head node
		System.out.println("Object to be Deleted" + data);
		Node<E> temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.getData().equals(data)) {
			head = temp.getNext(); // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (temp != null && !data.equals(temp.getData())) {
			prev = temp;
			temp = temp.getNext();
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.setNext(temp.getNext());
		if (prev.getNext()==null) {
			tail=prev;
		}
	}

	/**
	 * Function that returns the size of the linked list
	 * 
	 * @return
	 */
	public int size() {
		Node<E> tnode = head;
		int len = 0;
		while (tnode != null) {
			len++;
			tnode = tnode.getNext();
		}
		return len;
	}

	public String[] convArray(String[] array) {
		Node<E> tnode = head;
		int i = 0;
		while (tnode != null) {
			array[i] = String.valueOf(tnode.getData());
			tnode = tnode.getNext();
			i++;
		}
		return array;
	}

	public static int[] convertIntArray(String[] arr) {
		int[] arrInt = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrInt[i] = Integer.valueOf(arr[i]);
		}
		return arrInt;
	}

	public static int[] sort(int[] intArray) {
		int temp;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	public void printList() {
		Node<E> tnode = head;
		while (tnode != null) {
			System.out.print(tnode.getData() + " ");
			tnode = tnode.getNext();
		}
	}

	@Override
	public String toString() {
		String data = "";
		Node<E> tnode = head;
		while (tnode != null) {
			E value = tnode.getData();
			data += value.toString();
			tnode = tnode.getNext();
		}
		return data;
	}

	@Override
	public Iterator<E> iterator() {
		return new CustomIterator<>(this);
	}

	public class CustomIterator<E> implements Iterator<E> {

		Node<E> current = null;

		public CustomIterator(CustomLinkedList<E> list) {
			current = list.head;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public E next() {
			E value = current.getData();
			current = current.getNext();
			return value;
		}

	}
}
