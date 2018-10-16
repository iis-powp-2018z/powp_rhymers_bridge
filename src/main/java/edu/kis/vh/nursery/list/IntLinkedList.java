package edu.kis.vh.nursery.list;

public class IntLinkedList {

	int i;
    private Node last;

    protected static boolean isFull() {
        return false;
    }

    protected void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
		}
	}

    private boolean isEmpty() {
		return last == null;
	}

    protected int top() {
        if (isEmpty()) {
            return -1;
        }
		return last.value;
	}

    protected int pop() {
        if (isEmpty()) {
            return -1;
        }
		int ret = last.value;
        last = last.prev;
		return ret;
	}

}
