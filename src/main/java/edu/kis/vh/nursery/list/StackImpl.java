package edu.kis.vh.nursery.list;

public interface StackImpl {
    boolean isFull();

    void push(int i);

    boolean isEmpty();

    int top();

    int pop();

    int getSize();
}
