package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_LIST_INDICATOR = -1;
	private Node last;

    public void push(int value) {
        if (last == null)
            last = new Node(value);
        else {
            last.setNext(new Node(value));
            last.getNext().setPrev(last);
            last = last.getNext();
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
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_INDICATOR;
        int nodeValue = last.getValue();
        last = last.getPrev();
        return nodeValue;
    }
}
