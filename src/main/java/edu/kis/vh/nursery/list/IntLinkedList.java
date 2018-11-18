package edu.kis.vh.nursery.list;

public class IntLinkedList implements Stack{

    private Node last;
    private int i;

    public void countIn(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean callCheck() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int peeKaBoo() {
        if (callCheck())
            return -1;
        return last.getValue();
    }

    public int countOut() {
        if (callCheck())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
