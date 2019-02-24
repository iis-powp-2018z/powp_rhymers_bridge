package edu.kis.vh.nursery.collection;

public interface Stack {

	int getTotal();

	void push(int in);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}