package edu.kis.vh.nursery;

public interface IntStack {
    void push(int number);

    int pop();

    int peek();

    boolean isEmpty();

    boolean isFull();
}
