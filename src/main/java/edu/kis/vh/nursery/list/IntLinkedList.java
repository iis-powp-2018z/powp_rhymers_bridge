package edu.kis.vh.nursery.list;

public class IntLinkedList implements StackImpl {

    private Node last;
    private int size = 0;

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.next;
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return -1;
        }

        return last.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int ret = last.getValue();
        last = last.getPrev();
        size--;
        return ret;
    }

    @Override
    public int getSize() {
        return size;
    }
}
