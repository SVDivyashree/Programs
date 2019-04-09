package com.bridgelabz.util;

public class Dequeue<T> {
	
	/*
	 * Front is of the type Node and is 
	 * declared private to achieve encapsulation 
	 */
	private static Node front;
	
	/*
	 *rear is of the type Node and is 
	 * declared private to achieve encapsulation 
	 */
	private static Node rear;
	
	/*
	 * size is of the type integer and is 
	 * declared private to achieve encapsulation 
	 */
	public static int size=0;
	
	/**
	 * Function to check if the deque is empty or not
	 * 
	 * @return true if empty else false
	 */
	public static boolean isEmpty(){
		if(front==null)
			return true;
		else
			return false;
	}
 
	/**
	 * Function to get the size of the deque
	 * 
	 * @return size
	 */
	public static int size(){
		return size;
	}
	
	/**
	 * Function to add the specified element at the front of the deque
	 * 
	 * @param data the element to be added at the front of the deque
	 */
	public static void addFront(String data){
		if(front==null){
			Node tNode=new Node(data);
			front=tNode;
			rear=front;
		}
		else{
			Node tNode=new Node<>(data);
			tNode.setNext(front.getNext());
			front.setNext(tNode.getNext());
//			front.prev=tNode;
//			tNode.next=front;
			front=tNode;
		}
		size++;
	}
	
	/**
	 * Function to add the specified element at the rear of the deque
	 * 
	 * @param data the element to be added at the rear of the deque
	 */
	public static void addRear(char data){
		if(front==null){
			Node tNode=new Node(data);
			front=tNode;
			rear=front;
		}
		else{
			Node tNode=new Node(data);
			tNode.setNext(rear.getNext());
			rear.setNext(rear.getNext());
//			rear.next=tNode;
//			tNode.prev=rear;
			rear=tNode;
		}
		size++;
	}
	
	/**
	 * Function to delete the element from front end of the deque
	 * 
	 * @return the deleted element 
	 */
	public static Object removeFront(){
		Object val=null;
		if(front==null){
			System.out.println("No elements to delete");
		}
		else{
			val=front.getData();
			front=front.getNext();
//			val=front.data;
//			front=front.next;
		}
		size--;
		return val;
	}
	
	/**
	 * Function to delete the element from rear end of the deque
	 * 
	 * @return the deleted element 
	 */
	public static Object removeRear(){
		Object val=null;
		if(front==null){
			System.out.println("No element to delete");
		}
		else{
			val=rear.getData();
			rear=rear.getPrev();
			rear.setNext(null);
//			val=rear.data;
//			rear=rear.prev;
//			rear.next=null;
		}
		size--;
		return val;
	}
}
