package edu.kis.vh.nursery.collections;

public class IntLinkedList implements CollectionImpl {

    private Node last;
    private int size;

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
            return EMPTY_COLLECTION_VALUE;
        }

        return last.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_COLLECTION_VALUE;
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
