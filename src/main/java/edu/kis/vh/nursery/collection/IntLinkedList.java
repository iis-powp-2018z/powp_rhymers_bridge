package edu.kis.vh.nursery.collection;

public class IntLinkedList implements Stack {

	Node last;
	int size;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
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
			return INITIAL_VALUE;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return INITIAL_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return size;
	}

}
