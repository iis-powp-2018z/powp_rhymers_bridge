package edu.kis.vh.nursery.list;
import edu.kis.vh.nursery.Stack;
 
public class IntLinkedList implements Stack {

	private static final int EMPTY_STACK_ERROR = -1;
	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_ERROR;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_ERROR;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
