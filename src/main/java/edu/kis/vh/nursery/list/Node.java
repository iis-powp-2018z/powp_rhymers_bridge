package edu.kis.vh.nursery.list;

public class Node {

    private final int value;
    private Node prev;
	private Node next;

    public Node(final int value) {
        this.value = value;
    }

	int getValue() {
		return value;
	}

	Node getPrev() {
		return prev;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}
}
