package edu.kis.vh.nursery.list;

/**
 * Implementacja listy dla elementów typu int
 */
public class IntLinkedList {

    /**
     * Ostatni element listy
     */
    private Node last;
    private int i;

    /**
     * Metoda dodaje kolejny element typu int na koniec listy
     * @param i liczba całkowita która ma być dodana do listy
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * metda sprawdza czyy lista jest pusta
     * @return true jeśli lista jest pusta, false jeśli nie jest pusta
     */
    private boolean isEmpty() {
        return last == null;
    }

    /**
     * sprawdza czy lista jest pełna
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * metoda zwraca wartość ostatniego elementu listy
     * @return wartość ostatniego elementu listy lub -1 jeśli lista jest pusta
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * usuwa ostatni element list i zastępuje go przedostatnim
     * @return ostatni element listy lub -1 jeśli lista jest pusta
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
