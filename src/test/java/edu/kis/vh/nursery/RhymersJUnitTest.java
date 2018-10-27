package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	private static final int TEST_VALUE = 4;
	private static final int EMPTY_STACK_VALUE = -1;
	@Test
	public void testCountIn() {
		IntArrayStack rhymer = new IntArrayStack();
		rhymer.countIn(TEST_VALUE);

		int result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCallCheck() {
		IntArrayStack rhymer = new IntArrayStack();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		IntArrayStack rhymer = new IntArrayStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekaboo() {
		IntArrayStack rhymer = new IntArrayStack();
		
		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(TEST_VALUE);

		result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCountOut() {
		IntArrayStack rhymer = new IntArrayStack();
		
		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);


		rhymer.countIn(TEST_VALUE);

		result = rhymer.countOut();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
