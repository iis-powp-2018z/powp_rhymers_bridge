package edu.kis.vh.nursery.collections;

public class IntLinkedList implements Stack {

    public static final int EMPTY_STACK = 0;
    private Node last;
    private int i;
    private int size ;

    @Override
    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    @Override
    public boolean isEmpty() {
        return getLast() == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK;
        return getLast().getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    @Override
    public Node getLast() {
        return last;
    }

    @Override
    public void setLast(Node last) {
        this.last = last;
    }

    @Override
    public int getI() {
        return i;
    }
    @Override
    public int getTotal()
    {
        return size;
    }



}
