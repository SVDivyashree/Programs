package com.bridgelabz.util;

import java.util.Deque;

public class DequeueUtil<E>
{
	

		public E data;
		public DequeueUtil<E> next;
		public DequeueUtil<E> pre;

		public DequeueUtil() {
			this.next = null;
			this.pre = null;
		}

		public DequeueUtil(E val) {
			this.data = val;
			this.next = null;
			this.pre = null;
		}
	}
