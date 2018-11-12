
package edu.kis.vh.nursery.collections;

public class IntArrayStack implements Stack {

    public static final int DEFAULT_MIN = 0;
    private int[] numbers = new int[Stack.DEFAULT_STACK_CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = DEFAULT_MIN;

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[total++] = in;
    }


    public boolean callCheck() {
        return total == Stack.EMPTY_STACK;
    }

    public boolean isFull() {
        return total == Stack.DEFAULT_STACK_CAPACITY;
    }

    public int peekaboo() {
        if (callCheck())
            return Stack.EMPTY_STACK;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return Stack.EMPTY_STACK;
        return numbers[total--];
    }

    @Override
    public int top() {
        if (isEmpty())
            return Stack.EMPTY_STACK;
        return numbers[total - 1];
    }

    @Override
    public boolean isEmpty() {
        return total == Stack.EMPTY_STACK;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return Stack.EMPTY_STACK;
        return numbers[--total];
    }
}