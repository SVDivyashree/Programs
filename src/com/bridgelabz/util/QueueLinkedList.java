package com.bridgelabz.util;


	public class QueueLinkedList<T> {
		public static Node front;
		public static Node rear;
		public static int size=0;

		/**
		* Constructor to initialize the instance variables of
		* class Queue
		*/
		public QueueLinkedList(){
		front=null;
		rear=null;
		size=0;
		}

		/**
		* Function to check if the queue is empty or not
		*
		* @return true if empty else false
		*/
		public static boolean isQueueEmpty(){
		return front==null;
		}
		/**
		* Function to get the size of the queue
		*
		* @return size
		*/
		public static int getSize(){
		return size;
		}
		/**
		* Function to insert the specified element in the queue
		*
		* @param i the element to be inserted into the queue
		*/
		public void insert(T data){
		Node<T> node=new Node<T>(data,null);
		if(rear==null){
		front=node;
		rear=node;
		}
		else{
		rear.setNextRef(node);
		rear=rear.getNextRef();
		}
		size++;
		}
		/**
		* Function to remove the element
		*
		* @return the deleted element
		*/
		public T remove(){
		if(isQueueEmpty())
		{
		System.out.println("Underflow");
		}
		Node curr=front;
		front = curr.getNextRef();
		if (front == null){
		rear = null;
		size-- ;
		}
		return (T) curr.getValue();
		}

		/**
		* Function to display all the elements in the queue
		*/
		public static void display(){
		if(isQueueEmpty()){
		System.out.println("Queue is empty");
		return;
		}
		else{
		Node tNode=front;
		while(tNode!=null){
		System.out.print(tNode.getValue()+" ");
		tNode=tNode.getNextRef();
		}}}


	

}
