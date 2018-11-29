package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
 
	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		this.intLinkedList = intLinkedList;
	}

	private IntLinkedList intLinkedList;
	
	
	
    
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
