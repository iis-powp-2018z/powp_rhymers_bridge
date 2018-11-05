package edu.kis.vh.nursery.collections;

public class Node {

    private int value;
    private Node prev;
    private Node next;

    protected Node(int i) {
        setValue(i);
    }

    protected int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    protected Node getPrev() {
        return prev;
    }

    protected void setPrev(Node prev) {
        this.prev = prev;
    }

    protected Node getNext() {
        return next;
    }

    protected void setNext(Node next) {
        this.next = next;
    }
}
