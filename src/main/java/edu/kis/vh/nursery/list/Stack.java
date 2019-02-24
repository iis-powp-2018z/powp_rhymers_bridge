package edu.kis.vh.nursery.list;

public interface Stack {

	int getTotal();

	void push(int in);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}