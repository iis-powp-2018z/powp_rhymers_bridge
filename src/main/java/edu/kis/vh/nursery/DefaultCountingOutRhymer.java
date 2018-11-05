package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.Stack;

public class DefaultCountingOutRhymer {
    private  Stack stack;

    public DefaultCountingOutRhymer(Stack intLinkedList) {
        this.stack = intLinkedList;
    }

    public DefaultCountingOutRhymer() {
        stack = new IntLinkedList();
    }

    public int getTotal() {
        return stack.getTotal();
    }

    public void countIn(int i) {
        stack.push(i);
    }

    int peekaboo() {
        return stack.top();
    }

    int countOut() {
        return stack.pop();
    }

    boolean callCheck() {
        return stack.isEmpty();
    }
     boolean isFull( ){
        return stack.isFull();
    }
}