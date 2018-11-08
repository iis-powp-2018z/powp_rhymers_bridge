package edu.kis.vh.nursery.stack;
 import edu.kis.vh.nursery.Stack;
 public class IntLinkedList implements Stack {
	public static final int EMPTY_LIST = -1;
	private Node last;
	int i;
 	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}
 	public boolean isEmpty() {
		return last == null;
	}
 	public boolean isFull() {
		return false;
	}
 	public int top() {
		if (isEmpty()) {
			return IS_EMPTY;
		}
		return last.getValue();
	}
 	public int pop() {
		if (isEmpty()) {
			return IS_EMPTY;
		}
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
     private class Node {
         //W klasie IntLinkedList odwłowanie do atrybutów value, prev, next zostało wywołane przez gettery i settery
        private int value;
        private Node prev;
        private Node next;
         public Node(int i) {
            value = i;
        }
         public int getValue() {
            return value;
        }
         public Node getPrev() {
            return prev;
        }
         public void setPrev(Node prev) {
            this.prev = prev;
        }
         public Node getNext() {
            return next;
        }
         public void setNext(Node next) {
            this.next = next;
        }
    }
 }