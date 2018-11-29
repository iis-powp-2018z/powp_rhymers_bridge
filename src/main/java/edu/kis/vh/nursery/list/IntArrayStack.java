package edu.kis.vh.nursery.list;

public interface IntArrayStack {

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getSize();

}