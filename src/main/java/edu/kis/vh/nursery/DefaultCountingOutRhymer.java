package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack = new IntArrayStack();

    public DefaultCountingOutRhymer(){};

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public int peeKaBoo() {
        return intArrayStack.peeKaBoo();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }
}

