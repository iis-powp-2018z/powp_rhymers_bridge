package edu.kis.vh.nursery.collections;

import edu.kis.vh.nursery.Stack;

public class IntLinkedList implements Stack {

	private Node last;
	private int size;
	private static final int EMPTY_STACK = 0;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#push(int)
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#isEmpty()
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#isFull()
	 */
	public boolean isFull() {
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#top()
	 */
	
	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return last.getValue();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#pop()
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
    /* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#getSize()
	 */
    public int getSize() {
        return size;
    }

}
