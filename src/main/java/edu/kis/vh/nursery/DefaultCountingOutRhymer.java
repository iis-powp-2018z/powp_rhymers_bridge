package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
 
	public DefaultCountingOutRhymer(IntArrayStack intLinkedList) {
		this.intLinkedList = intLinkedList;
	}

	private IntArrayStack intLinkedList;
	
	
	
    
    public DefaultCountingOutRhymer() {
        intLinkedList = new IntLinkedList();
    }
    
    
    public int getTotal() {
        return intLinkedList.getSize();
    }
    
    public void countIn(int in) {
        intLinkedList.push(in);
    }
    boolean isFull() {
        return intLinkedList.isFull();
    }

    int peekaboo() {
        return intLinkedList.top();
    }
    
    int countOut() {
        return intLinkedList.pop();
    }
    
    boolean callCheck() {
        return intLinkedList.isEmpty();
    }
    
}
