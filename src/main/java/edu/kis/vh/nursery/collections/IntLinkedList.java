package edu.kis.vh.nursery.collections;

public class IntLinkedList implements IntStackImplementation {

	private Node last;
	private int i;

	@Override
    public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
		i++;
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
    public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return last.value;
	}

	@Override
    public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		int ret = last.value;
		last = last.prev;
		i--;
		return ret;
	}

    @Override
    public int getSize() {
        return i;
    }

	private class Node {

        protected int value;
        protected Node prev, next;

        protected Node(final int i) {
            value = i;
        }

    }
}
