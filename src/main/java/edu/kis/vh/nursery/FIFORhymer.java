package edu.kis.vh.nursery;

/**
 * @author Radek
 * Klasa FIFORhymer dziedziczy po klasie DefaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	
	/**
	 * utowrzenie nwego obiektu DefaultCountingOutRhymer
	 */
	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countOut()
	 * zastąpienie z nadklasy metody countOut
	 */
	
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}
