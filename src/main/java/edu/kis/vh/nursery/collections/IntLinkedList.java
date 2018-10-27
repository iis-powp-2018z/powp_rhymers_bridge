package edu.kis.vh.nursery.collections;

public class IntLinkedList implements StackImpementation {

	private Node last;
	private int listSize;
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackImpementation#isFull()
	 */
	@Override
	public boolean isFull() {
		return false; // TODO: needs remove
	}
	

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackImpementation#push(int)
	 */
	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
		listSize++;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackImpementation#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return last == null;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackImpementation#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackImpementation#pop()
	 */
	@Override
	public int pop() {
		
		if (isEmpty())
			return -1;
		
		int ret = last.value;
		last = last.prev;
		
		listSize--;
		return ret;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackImpementation#getSize()
	 */
	@Override
	public int getSize() {
		return listSize;
	}

}
