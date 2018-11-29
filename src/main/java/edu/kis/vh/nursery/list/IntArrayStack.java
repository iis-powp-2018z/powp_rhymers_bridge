package edu.kis.vh.nursery.list;

public class IntArrayStack {


	
		private static final int FULL_STACK = 11;

		private static final int TOTAL_START = -1;

		private static final int NUMBERS_MAX = 12;
		

		private int[] numbers = new int[NUMBERS_MAX];

		private int total = TOTAL_START;

		public void countIn(int in) {
			if (!isFull())
				numbers[++total] = in;
		}

		protected boolean callCheck() {
			return total == TOTAL_START;
		}

		public boolean isFull() {
			return total == FULL_STACK;
		}

		protected int peekaboo() {
			if (callCheck())
				return TOTAL_START;
			return numbers[total];
		}

		public int countOut() {
			if (callCheck())
				return -1;
			return numbers[total--];
		}
		
		   public int getTotal() {
		        return total;
		    }
}
