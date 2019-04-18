package com.bridgelabz.util;

public class Stack {
	private int stackSize;
	private int[] stackArr;
	private int top;

	public Stack()
	{
		int size=100;
		this.stackSize = size;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}

	public void push(int entry) throws Exception {
		if(top==99)
		{
			throw new Exception("Stack is already full. Can not add element.");
		}
		System.out.println("Adding: "+entry);
		this.stackArr[++top] = entry;
	}

	public int pop() throws Exception {
		if(top==-1)
		{
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = this.stackArr[top--];
		System.out.println("Removed entry: "+entry);
		return entry;
	}

	public int peek()
	{
		return stackArr[top];
	}

	public boolean isStackEmpty() 
	{
		if(top==-1) {
			System.out.println("The stack is empty");

		}
		return true;
	}
	public boolean isStackFull()	
	{
		if(top==99)
			System.out.println("The stack is full");

		return true;
	}
}