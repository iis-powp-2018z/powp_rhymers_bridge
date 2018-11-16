package edu.kis.vh.nursery.collections;

public interface IntStackImplementation {

    int EMPTY_STACK = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getSize();
}
