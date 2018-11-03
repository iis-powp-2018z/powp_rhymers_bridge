package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.IntLinkedList;
import edu.kis.vh.nursery.collections.StackImplementation;

public class DefaultCountingOutRhymer {

	private StackImplementation stackImplementation;
	
	public DefaultCountingOutRhymer() {
		this("array");
	}
	
	public DefaultCountingOutRhymer(String string) {
        switch (string) {
            case "array":
            	stackImplementation = new IntArrayStack();
                break;
            case "list":
            	stackImplementation = new IntLinkedList();
                break;
            default:
                System.out.println("Brak parametru");
                break;
        }
    }


	public int getTotal() {
		return stackImplementation.getSize();
	}

	public void countIn(int in) {
		stackImplementation.push(in);
	}

	boolean isFull() {
		return stackImplementation.isFull();
	}

	int peekaboo() {
		return stackImplementation.top();
	}

	int countOut() {
		return stackImplementation.pop();
	}

	boolean callCheck() {
		return stackImplementation.isEmpty();
	}
}
