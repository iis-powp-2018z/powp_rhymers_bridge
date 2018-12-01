package edu.kis.vh.nursery;


import edu.kis.vh.nursery.collections.IntLinkedList;


public class DefaultCountingOutRhymer {
 
	private Stack stack;

	public DefaultCountingOutRhymer(Stack stack) {

		this.stack = stack;
	}

	    
    public DefaultCountingOutRhymer() {

        this.stack = new IntLinkedList();
    }
    
	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		this.stack = intLinkedList;
	}
    

    public void countIn(int in) {
    	stack.push(in);
    }
    boolean isFull() {
        return stack.isFull();
    }

    int peekaboo() {
        return stack.top();
    }
    
    int countOut() {
        return stack.pop();
    }
    
    boolean callCheck() {
        return stack.isEmpty();
    }
    
}
