package stack;

import edu.kis.vh.nursery.Stack;

public class IntArrayStack implements Stack{
    private static final int NUMBERS_CAPACITY = 12;
    private int[] numbers = new int[NUMBERS_CAPACITY];
    private int total = IS_EMPTY;
     
     public void push(int in) {
     	if (!isFull()) {
            numbers[++total] = in;
        }
    }
     public boolean isEmpty() {
        return total == IS_EMPTY;
    }
     public boolean isFull() {
        return total == NUMBERS_CAPACITY -1;
    }
     public int top() {
         if (isEmpty()) {
            return IS_EMPTY;
        }
        return numbers[total];
    }
     public int pop() {
         if (isEmpty()) {
            return IS_EMPTY;
        }
        return numbers[total--];
    }
     public int getTotal() {
        return total;
    }
} 