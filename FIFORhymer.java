package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;

/**
 * @author Radek
 * Klasa FIFORhymer dziedziczy po klasie DefaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	
	public FIFORhymer() {
		super();
		this.temp = new IntLinkedList();
		// TODO Auto-generated constructor stub
	}


	public FIFORhymer(IntLinkedList intLinkedList) {
		super(intLinkedList);
		// TODO Auto-generated constructor stub
	}


	public FIFORhymer(Stack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	private Stack temp;
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countOut()
	 * zastąpienie z nadklasy metody countOut
	 */
	
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}
}
