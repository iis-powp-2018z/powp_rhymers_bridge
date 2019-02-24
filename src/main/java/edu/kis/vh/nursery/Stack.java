package edu.kis.vh.nursery;

public interface Stack {

	int getTotal();

	void push(int in);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}