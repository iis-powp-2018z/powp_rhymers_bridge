package edu.kis.vh.nursery.stack;

public interface Stack {

    int EMPTY_STACK = 0;

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peeKaBoo();

    int countOut();
}
