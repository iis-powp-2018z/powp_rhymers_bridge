package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;

public class DefaultCountingOutRhymer {

    private IntArrayStack stack;

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }


    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    public int countOut() {
        return stack.countOut();
    }

    public int getTotal() {
        return stack.getTotal();
    }
}
