package edu.kis.vh.nursery.list;

class IntLinkedList {

	private Node last;
	
	/**
	 * Check if list is full.
	 *
	 * @return always false.
	 */
	protected static boolean isFull() {
		return false; // TODO: needs remove
	}
	

	/**
	 * Add integer to end of the stack.
	 *
	 * @param i - integer to add.
	 */
	protected void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
	
	/**
	 * Check if list is empty.
	 *
	 * @return true if stack is empty otherwise false.
	 */
	private boolean isEmpty() {
		return last == null;
	}
	
	/**
	 * Get value from last added element to stack.
	 *
	 * @return value of last element of stack.
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	/**
	 * Pop out value from top of the list. 
	 *
	 * @return last element of stack if stack is not empty otherwise return -1
	 */
	protected int pop() {
		
		if (isEmpty())
			return -1;
		
		int ret = last.value;
		last = last.prev;
		
		return ret;
	}

}
