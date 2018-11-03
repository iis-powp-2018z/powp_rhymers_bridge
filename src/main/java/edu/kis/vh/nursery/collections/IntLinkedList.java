package edu.kis.vh.nursery.collections;

public class IntLinkedList implements StackImplementation {

	private Node last;
	private int listSize;
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackImpementation#isFull()
	 */
	@Override
	public boolean isFull() {
		return false; 
	}
	

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackImpementation#push(int)
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
			return EMPTY_STACK;
		return last.getValue();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackImpementation#pop()
	 */
	@Override
	public int pop() {
		
		if (isEmpty())
			return EMPTY_STACK;
		
		int ret = last.getValue();
		last = last.getPrev();
		
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
