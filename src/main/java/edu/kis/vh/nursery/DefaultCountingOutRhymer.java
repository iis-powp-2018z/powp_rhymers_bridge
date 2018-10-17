package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.StackImpl;

public class DefaultCountingOutRhymer {

    private StackImpl stackImpl;

    public DefaultCountingOutRhymer(String type) {
        switch (type) {
            case "array":
                stackImpl = new IntArrayStack();
                break;
            case "list":
                stackImpl = new IntLinkedList();
                break;
            default:
                System.out.println("Blad - parametr nieznany");
                break;
        }
    }

    public int getTotal() {
        return stackImpl.getSize();
    }

    public void countIn(int in) {
        stackImpl.push(in);
    }

    boolean isFull() {
        return stackImpl.isFull();
    }

    int peekaboo() {
        return stackImpl.top();
    }

    int countOut() {
        return stackImpl.pop();
    }

    boolean callCheck() {
        return stackImpl.isEmpty();
    }
}
