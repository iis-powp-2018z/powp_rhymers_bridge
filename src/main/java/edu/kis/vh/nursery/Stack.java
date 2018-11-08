package edu.kis.vh.nursery;

public interface Stack {
	int IS_EMPTY = 0;
	
	void push(int i);
    boolean isEmpty();
    boolean isFull();
    int top();
    int pop();

}
