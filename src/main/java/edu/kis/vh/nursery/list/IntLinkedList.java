package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;

    private void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    private boolean isEmpty() {
        return getLast() == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return -1;
        return getLast().getValue();
    }

    private int pop() {
        if (isEmpty())
            return -1;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    protected Node getLast() {
        return last;
    }

    protected void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }

}
