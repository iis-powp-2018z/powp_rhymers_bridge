package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

public class IntArrayStackTest {

	@Test
	public void testCountIn() {
		IntArrayStack stack = new IntArrayStack();
		int testValue = 4;

		stack.countIn(testValue);

		int result = stack.peekaboo();Assert.assertEquals(testValue,result);

	}

	@Test
	public void testCallCheck() {
		IntArrayStack stack = new IntArrayStack();
		boolean result = stack.callCheck();
		Assert.assertEquals(true, result);

		stack.countIn(888);

		result = stack.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		IntArrayStack stack = new IntArrayStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stack.isFull();
			Assert.assertEquals(false, result);
			stack.countIn(888);
		}

		boolean result = stack.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		IntArrayStack stack = new IntArrayStack();
		final int EMPTY_STACK_VALUE = -1;

		int result = stack.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stack.countIn(testValue);

		result = stack.peekaboo();
		Assert.assertEquals(testValue, result);
		result = stack.peekaboo();
		Assert.assertEquals(testValue, result);
	}

}
