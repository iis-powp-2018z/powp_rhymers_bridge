package edu.kis.vh.nursery;

public class IntArrayStack implements Stack {


		private static final int CHECK_FULL = 11;

		private static final int CHECK_ERROR = -1;

		private static final int ARRAY_SIZE = 12;

		private int[] NUMBERS = new int[ARRAY_SIZE];

		private int total = CHECK_ERROR;

		/* (non-Javadoc)
		 * @see edu.kis.vh.nursery.Stack#getTotal()
		 */
		@Override
		public int getTotal() {
			return total;
		}

		/* (non-Javadoc)
		 * @see edu.kis.vh.nursery.Stack#push(int)
		 */
		@Override
		public void push(int in) {
			if (!isFull())
				NUMBERS[++total] = in;
		}

		/* (non-Javadoc)
		 * @see edu.kis.vh.nursery.Stack#isEmpty()
		 */
		@Override
		public boolean isEmpty() {
			return total == CHECK_ERROR;
		}

		/* (non-Javadoc)
		 * @see edu.kis.vh.nursery.Stack#isFull()
		 */
		@Override
		public boolean isFull() {
			return total == CHECK_FULL;
		}

		/* (non-Javadoc)
		 * @see edu.kis.vh.nursery.Stack#top()
		 */
		@Override
		public int top() {
			if (isEmpty())
				return CHECK_ERROR;
			return NUMBERS[total];
		}

		/* (non-Javadoc)
		 * @see edu.kis.vh.nursery.Stack#pop()
		 */
		@Override
		public int pop() {
			if (isEmpty())
				return CHECK_ERROR;
			return NUMBERS[total--];
		}

	}

