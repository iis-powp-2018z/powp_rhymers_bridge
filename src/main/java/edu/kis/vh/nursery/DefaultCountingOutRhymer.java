package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int _11 = 11;

	private static final int _12 = 12;

	private static final int INT = -1;

	private int[] NUMBERS = new int[_12];

	public int total = INT;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == INT;
		}
		
			public boolean isFull() {
				return total == _11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return INT;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return INT;
						return NUMBERS[total--];
					}

}
