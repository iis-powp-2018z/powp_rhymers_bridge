package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	private int i;

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
			return -1;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	int getI() {
		return i;
	}

	Node getLast() {
		return last;
	}

}

class Node {

	protected int value;
	protected Node prev, next;

	protected Node(final int i) {
		value = i;
	}

}

//alt + strzałki
//Przeskoczenie pomiędzy ostatnio edytowanymi plikami do lokalizacji gdzie wykonywana była ostatia zmiana.
//Strzałka w lewo cofa się w historii, strzałka w prawo idzie do przodu.
