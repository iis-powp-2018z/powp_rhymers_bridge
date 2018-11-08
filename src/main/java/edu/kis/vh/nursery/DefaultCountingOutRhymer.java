package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer implements Generate {
	
	private IntLinkedList intLinkList =  new IntLinkedList();
	
	public DefaultCountingOutRhymer(IntLinkedList intLinkList) {
		super();
		this.intLinkList = intLinkList;
	}
	
	public DefaultCountingOutRhymer() {
		
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.Generate#countIn(int)
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.Generate#countIn(int)
	 */
	@Override
	public void countIn(int in) {
		if (!intLinkList.isFull())
			intLinkList.push(in);
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.Generate#callCheck()
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.Generate#callCheck()
	 */
	@Override
	public boolean callCheck() {
		return intLinkList.isEmpty();
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.Generate#isFull()
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.Generate#isFull()
	 */
	@Override
	public boolean isFull() {
		return intLinkList.isFull();
	}
	
	protected int peekaBoo() {

		if (callCheck())
			return -1;
		return intLinkList.top();
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.Generate#countOut()
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.Generate#countOut()
	 */
	@Override
	public int countOut() {
		if (callCheck())
			return -1;
		return intLinkList.pop();

	}
}
