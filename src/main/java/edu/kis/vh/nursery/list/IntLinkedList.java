package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int EMPTY_LIST_INDICATOR = -1;
	private Node last;

    public void push(final int value) {
        if (last == null)
            last = new Node(value);	// TODO I think braces (parentheses) need to be used here
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
            return EMPTY_LIST_INDICATOR;	// TODO I think braces (parentheses) need to be used here
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_INDICATOR;	// TODO I think braces (parentheses) need to be used here
        final int nodeValue = last.getValue();
        last = last.getPrev();
        return nodeValue;
    }

    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        public Node(final int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }

        Node getPrev() {
            return prev;
        }

        void setPrev(Node prev) {
            this.prev = prev;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }
    }
}
// alt + arrow left/right returns to previous/following file one works with
