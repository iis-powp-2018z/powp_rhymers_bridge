package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.Stack;

public class DefaultCountingOutRhymer {

    private Stack stack = new IntArrayStack();

    public DefaultCountingOutRhymer(){};

    public DefaultCountingOutRhymer(Stack stack) {
        this.stack = stack;
    }

    public int peeKaBoo() {
        return stack.peeKaBoo();
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int countOut() {
        return stack.countOut();
    }
}

