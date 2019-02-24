package edu.kis.vh.nursery.collection;

public interface Stack {
	static final int CHECK_FULL = 11;

	static final int INITIAL_VALUE = 0;

	static final int ARRAY_SIZE = 12;

	int[] NUMBERS = new int[ARRAY_SIZE];

	int getTotal();

	void push(int in);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}