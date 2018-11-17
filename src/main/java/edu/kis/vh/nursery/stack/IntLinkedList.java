package edu.kis.vh.nursery.stack;

/**
 * Implementacja listy dla elementów typu int
 */
public class IntLinkedList implements Stacker {
    /**
     * Ostatni element listy
     */
    private Node last;
    private int i = INIT_EMPTY_STACK;

    /**
     * Metoda dodaje kolejny element typu int na koniec listy
     * @param i liczba całkowita która ma być dodana do listy
     */
    @Override
    public void push(int i) {
        if(!isFull()) {
            if (last == null)
                last = new Node(i);
            else {
                last.setNext(new Node(i));
                last.getNext().setPrev(last);
                last = last.getNext();
            }
        }
        this.i++;
    }

    /**
     * metda sprawdza czyy lista jest pusta
     * @return true jeśli lista jest pusta, false jeśli nie jest pusta
     */
    @Override
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * sprawdza czy lista jest pełna
     * @return false
     */
    @Override
    public boolean isFull() {
        return this.i == (MAX_STACK_SIZE - 1);
    }

    /**
     * metoda zwraca wartość ostatniego elementu listy
     * @return wartość ostatniego elementu listy lub -1 jeśli lista jest pusta
     */
    @Override
    public int top() {
        if (isEmpty())
            return INIT_EMPTY_STACK;
        return last.getValue();
    }

    /**
     * usuwa ostatni element list i zastępuje go przedostatnim
     * @return ostatni element listy lub -1 jeśli lista jest pusta
     */
    @Override
    public int pop() {
        if (isEmpty())
            return INIT_EMPTY_STACK;
        int ret = last.getValue();
        last = last.getPrev();
        this.i--;
        return ret;
    }

}
