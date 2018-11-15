package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.StackImplementation;

/**
 * @author Radek
 * Klasa FIFORhymer dziedziczy po klasie DefaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	
	/**
	 * utowrzenie nwego obiektu DefaultCountingOutRhymer
	 */
	public DefaultCountingOutRhymer temp = new HanoiRhymer();

	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countOut()
	 * zastąpienie z nadklasy metody countOut
	 */
	
	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FIFORhymer(StackImplementation intLinkedlist) {
		super(intLinkedlist);
		// TODO Auto-generated constructor stub
	}


	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}
