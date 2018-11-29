package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
 
	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	private IntArrayStack intArrayStack;
	
	
    
    public DefaultCountingOutRhymer() {
        intArrayStack = new IntLinkedList();
    }
    
    
    public int getTotal() {
        return intArrayStack.getSize();
    }
    
    public void countIn(int in) {
        intArrayStack.push(in);
    }
    boolean isFull() {
        return intArrayStack.isFull();
    }

    int peekaboo() {
        return intArrayStack.top();
    }
    
    int countOut() {
        return intArrayStack.pop();
    }
    
    boolean callCheck() {
        return intArrayStack.isEmpty();
    }
    
}
