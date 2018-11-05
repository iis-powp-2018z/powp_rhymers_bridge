package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    private final IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRhymer() {
        intLinkedList = new IntLinkedList();
    }

    public int getTotal() {
        return intLinkedList.getTotal();
    }

    public void countIn(int i) {
        intLinkedList.push(i);
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
     boolean isFull( ){
        return intLinkedList.isFull();
    }
}