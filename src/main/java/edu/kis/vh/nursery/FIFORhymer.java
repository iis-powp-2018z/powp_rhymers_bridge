package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
	//iodsgji
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
