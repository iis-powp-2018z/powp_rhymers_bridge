package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_LIST_INDICATOR = -1;
	Node last;
    int i;

    public void push(int value) {
        if (last == null)
            last = new Node(value);
        else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_LIST_INDICATOR;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_INDICATOR;
        int nodeValue = last.value;
        last = last.prev;
        return nodeValue;
    }
}
