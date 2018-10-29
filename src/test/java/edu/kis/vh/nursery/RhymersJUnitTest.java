package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.collections.IntArrayStack;

public class RhymersJUnitTest {

	private static final int TEST_VALUE = 4;
	private static final int EMPTY_STACK_VALUE = -1;
	@Test
	public void testCountIn() {
		IntArrayStack rhymer = new IntArrayStack();
		rhymer.push(TEST_VALUE);

		int result = rhymer.top();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCallCheck() {
		IntArrayStack rhymer = new IntArrayStack();
		boolean result = rhymer.isEmpty();
		Assert.assertTrue(result);

		rhymer.push(888);

		result = rhymer.isEmpty();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		IntArrayStack rhymer = new IntArrayStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.push(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekaboo() {
		IntArrayStack rhymer = new IntArrayStack();
		
		int result = rhymer.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.push(TEST_VALUE);

		result = rhymer.top();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.top();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCountOut() {
		IntArrayStack rhymer = new IntArrayStack();
		
		int result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);


		rhymer.push(TEST_VALUE);

		result = rhymer.pop();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
