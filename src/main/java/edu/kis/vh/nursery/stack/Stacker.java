package edu.kis.vh.nursery.stack;

public interface Stacker {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
