package edu.kis.vh.nursery.list;

public class IntLinkedList implements IntArrayStack {

	private Node last;
	private int size;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#push(int)
	 */
	@Override
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
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
    /* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStack#getSize()
	 */
    @Override
	public int getSize() {
        return size;
    }

}
