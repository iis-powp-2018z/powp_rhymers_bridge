package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private final IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer(IntLinkedList intArrayList) {
        intLinkedList = intArrayList;
    }

    public DefaultCountingOutRhymer() {
        intLinkedList = new IntLinkedList();
    }

    public int getTotal() {
        return intLinkedList.getSize();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    boolean isFull() {
        return intLinkedList.isFull();
    }

    int peekaboo() {
        return intLinkedList.top();
    }

    int countOut() {
        return intLinkedList.pop();
    }

    boolean callCheck() {
        return intLinkedList.isEmpty();
    }
}
