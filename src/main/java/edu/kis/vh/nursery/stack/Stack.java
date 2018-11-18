package edu.kis.vh.nursery.stack;

public interface Stack {

    int EMPTY_STACK = -1;

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peeKaBoo();

    int countOut();
}
