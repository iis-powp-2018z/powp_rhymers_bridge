package edu.kis.vh.nursery.collections;

import edu.kis.vh.nursery.Stack;

public class IntArrayStack implements Stack {


		private static final int FULL_STACK = 11;

		private static final int EMPTY_STACK = 0;

		private static final int NUMBERS_MAX = 12;
		

		private int[] numbers = new int[NUMBERS_MAX];

		private int total = EMPTY_STACK;

		public void push(int in) {
			if (!isFull())
				numbers[++total] = in;
		}

		public boolean isEmpty() {
			return total == EMPTY_STACK;
		}

		public boolean isFull() {
			return total == FULL_STACK;
		}

		public int top() {
			if (isEmpty())
				return EMPTY_STACK;
			return numbers[total];
		}

		public int pop() {
			if (isEmpty())
				return EMPTY_STACK;
			return numbers[total--];
		}
		
		   public int getTotal() {
		        return total;
		    }
}
