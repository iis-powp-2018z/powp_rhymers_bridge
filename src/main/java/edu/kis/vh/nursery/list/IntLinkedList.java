package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int size;

    public boolean isFull() {
        return false;
    }

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

    public boolean isEmpty() {
		return last == null;
	}

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        
        return last.getValue();
	}

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int ret = last.getValue();
        last = last.getPrev();
        size--;
		return ret;
	}

    public int getSize() {
        return size;
    }
}
