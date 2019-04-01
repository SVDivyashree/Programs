package com.bridgelabz.util;

public class Queue<T> {

	public static int capacity = 20;
	private static Object queue[] = new Object[capacity];
	private static int front = -1;
	static int rear=0;
	static int size=0;

	public void enque(T item) {
		if (size == capacity) {
			expand();
		}
		queue[rear++] = item;
		size++;
	}

	public static int deque() {
		if (size > 0) {
			if (size < capacity ) {
				shrink();
			}
			queue[++front] = null;
			size--;
		}
		return capacity;
	}

	public static void expand() {
		Object[] newar = new Object[capacity * 2];
		capacity *= 2;
		for (int i = front + 1; i < rear; i++) {
			newar[i] = queue[i];
		}
		queue = newar;
	}

	public static void shrink() {
		Object newar[] = new Object[(capacity)];
		capacity = capacity-1;
		int j = 0;
		for (int i = front + 1; i < rear; i++) {
			newar[j++] = queue[i];
		}
		front = -1;
		rear = size;
		queue = newar;
	}

	static boolean isEmpty() {
		return size == 0;
	}

	static int size() {
		return size;
	}

	public String toString() {
		String s = "{ ";
		for (int i = front + 1; i < rear; i++) {
			s = s + queue[i] + ", ";
		}
		s = s + "}";
		return s;
	}
}

