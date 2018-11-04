package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intstack.IntArrayStack;
import edu.kis.vh.nursery.intstack.IntStack;

public class DefaultCountingOutRhymer {
    private IntStack intStack;

    public DefaultCountingOutRhymer() {
        this(new IntArrayStack());
    }

    public DefaultCountingOutRhymer(IntStack intStack) {
        this.intStack = intStack;
    }

    public void countIn(int number) {
        intStack.push(number);
    }

    public int countOut() {
        return intStack.pop();
    }

    public int peekABoo() {
        return intStack.peek();
    }

    public boolean callCheck() {
        return intStack.isEmpty();
    }

    public boolean isFull() {
        return intStack.isFull();
    }
}
