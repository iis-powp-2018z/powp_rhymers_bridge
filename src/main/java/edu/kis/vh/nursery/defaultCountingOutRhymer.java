package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer() {
        this(new IntArrayStack());
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public void countIn(int number) {
        intArrayStack.push(number);
    }

    public int countOut() {
        return intArrayStack.pop();
    }

    public int peekABoo() {
        return intArrayStack.peek();
    }

    public boolean callCheck() {
        return intArrayStack.isEmpty();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }
}
