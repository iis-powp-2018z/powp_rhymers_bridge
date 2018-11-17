package edu.kis.vh.nursery.implementsStack;

import edu.kis.vh.nursery.Stack;

public class IntArrayStack implements Stack {

	private static final int fullStack = 11;

	private static final int EmptyStack = -1;

	private static final int stackCapacity = 12;

	private int[] numbers = new int[stackCapacity];

	private int total = EmptyStack;

	public int getTotal() {
		return total;
	}
	
	

	public void push(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean isEmpty() {
		return total == EmptyStack;
	}

	public boolean isFull() {
		return total == fullStack;
	}

	public int top() {
		if (isEmpty())
			return EmptyStack;
		return numbers[total];
	}

	public int pop() {
		if (isEmpty())
			return EmptyStack;
		return numbers[total--];
	}

}
