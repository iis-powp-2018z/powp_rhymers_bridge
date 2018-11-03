package edu.kis.vh.nursery.list;

/**
 * Implementacja listy dwukierunkowej, której wartościami
 * są liczby calkowite.
 * @author Monika
 *
 */
public class IntLinkedList {

	private static final int EMPTY_STACK = -1;

	private Node last;
	private int i;

	/**
	 * Dodaje element na koncu listy
	 * @param i - liczba calkowita
	 */
	public void push(final int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Zwraca true, jesli lista jest pusta
	 * @return
	 */
	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	/**
	 * Zwraca wartosc ostatniego elementu
	 * na liscie
	 * @return
	 */
	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return last.getValue();
	}

	/**
	 * Usuwa ostatni element z listy
	 * @return wartosc usunietego elementu
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	/**
	 * Reprezentuje element na liscie
	 * @see IntLinkedList
	 * @author Monika
	 *
	 */
	private class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			value = i;
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

}
