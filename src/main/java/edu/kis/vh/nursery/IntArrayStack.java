package edu.kis.vh.nursery;


public class IntArrayStack implements Stack{
    private static final int NUMBERS_CAPACITY = 12;
    private static final int ARRAY_EMPTY = -1;
    private int[] numbers = new int[NUMBERS_CAPACITY];
     private int total = ARRAY_EMPTY;
     
     public void push(int in) {
     	if (!isFull()) {
            numbers[++total] = in;
        }
    }
     public boolean isEmpty() {
        return total == ARRAY_EMPTY;
    }
     public boolean isFull() {
        return total == NUMBERS_CAPACITY -1;
    }
     public int top() {
         if (isEmpty()) {
            return ARRAY_EMPTY;
        }
        return numbers[total];
    }
     public int pop() {
         if (isEmpty()) {
            return ARRAY_EMPTY;
        }
        return numbers[total--];
    }
     public int getTotal() {
        return total;
    }
} 