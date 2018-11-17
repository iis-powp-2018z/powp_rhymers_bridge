package edu.kis.vh.nursery.stack;

public interface Stacker {

    int MAX_STACK_SIZE = 12;
    int INIT_EMPTY_STACK = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
