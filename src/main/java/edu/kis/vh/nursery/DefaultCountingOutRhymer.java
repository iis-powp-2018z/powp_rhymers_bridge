package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.Stacker;

public class DefaultCountingOutRhymer {

    private Stacker stack;

    public DefaultCountingOutRhymer(Stacker stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }


    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public int countOut() {
        return stack.pop();
    }

}
