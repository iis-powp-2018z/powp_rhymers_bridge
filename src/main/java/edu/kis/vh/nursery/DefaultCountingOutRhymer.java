package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collections.IntLinkedList;
import edu.kis.vh.nursery.collections.IntStackImplementation;

public class DefaultCountingOutRhymer {

    private final IntStackImplementation intStackImplementation;

    public DefaultCountingOutRhymer(IntLinkedList intStackImplementation){
        this.intStackImplementation = intStackImplementation;
    }

    public DefaultCountingOutRhymer(){
        intStackImplementation = new IntLinkedList();
    }

    public int getTotal(){
        return intStackImplementation.getSize();
    }

    public void countIn(int in){
        intStackImplementation.push(in);
    }

    protected boolean callCheck() {
        return intStackImplementation.isEmpty();
    }

    protected boolean isFull(){
        return intStackImplementation.isFull();
    }

    protected int peekaboo() {
        return intStackImplementation.top();
    }

    protected int countOut() {
        return intStackImplementation.pop();
    }

}
