package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int EMPTY_VALUE = -1;

    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
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
        return last.value;
    }

    private int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }
}
