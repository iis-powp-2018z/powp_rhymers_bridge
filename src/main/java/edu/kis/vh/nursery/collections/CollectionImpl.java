package edu.kis.vh.nursery.collections;

public interface CollectionImpl {
    int EMPTY_COLLECTION_VALUE = -1;

    boolean isFull();

    void push(int i);

    boolean isEmpty();

    int top();

    int pop();

    int getSize();
}
