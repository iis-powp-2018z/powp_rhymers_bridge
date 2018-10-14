package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int EMPTY_VALUE = -1;

    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.getValue();
    }

    private int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        final int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}
