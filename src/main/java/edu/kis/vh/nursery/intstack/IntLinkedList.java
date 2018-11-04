package edu.kis.vh.nursery.intstack;

public class IntLinkedList implements IntStack{
    private static final int EMPTY_VALUE = -1;

    private Node last;

    @Override
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_VALUE;
        }
        final int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }


    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
    @Override
    public int peek() {
        if (isEmpty()) {
            return EMPTY_VALUE;
        }
        return last.getValue();
    }

    private static class Node {
        private int value;
        private Node prev;
        private Node next;

        Node(int i) {
            this.setValue(i);
        }

        int getValue() {
            return value;
        }

        void setValue(int value) {
            this.value = value;
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
