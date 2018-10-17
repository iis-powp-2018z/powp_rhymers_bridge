package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.CollectionImpl;
import edu.kis.vh.nursery.collections.IntArrayCollection;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class DefaultCountingOutRhymer {

    private CollectionImpl collectionImpl;

    public DefaultCountingOutRhymer() {
        this("array");
    }

    public DefaultCountingOutRhymer(String type) {
        switch (type) {
            case "array":
                collectionImpl = new IntArrayCollection();
                break;
            case "list":
                collectionImpl = new IntLinkedList();
                break;
            default:
                System.out.println("Blad - parametr nieznany");
                break;
        }
    }

    public int getTotal() {
        return collectionImpl.getSize();
    }

    public void countIn(int in) {
        collectionImpl.push(in);
    }

    boolean isFull() {
        return collectionImpl.isFull();
    }

    int peekaboo() {
        return collectionImpl.top();
    }

    int countOut() {
        return collectionImpl.pop();
    }

    boolean callCheck() {
        return collectionImpl.isEmpty();
    }
}
