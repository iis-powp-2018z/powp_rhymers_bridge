package edu.kis.vh.nursery.intstack;

public interface IntStack {
    int EMPTY_STACK_ERROR = 0;

    void push(int number);

    int pop();

    int peek();

    boolean isEmpty();

    boolean isFull();
}
