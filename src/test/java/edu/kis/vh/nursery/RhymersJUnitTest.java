package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.Stack;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		Stack rhymer = new IntArrayStack();
		int testValue = 4;
		rhymer.push(testValue);

		int result = rhymer.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		Stack rhymer = new IntArrayStack();
		boolean result = rhymer.isEmpty();
		Assert.assertEquals(true, result);

		rhymer.push(888);

		result = rhymer.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack rhymer = new IntArrayStack();
		final int STACK_CAPACITY = 12;
		for (int i = 1; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.push(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		Stack rhymer = new IntArrayStack();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.push(testValue);

		result = rhymer.top();
		Assert.assertEquals(testValue, result);
		result = rhymer.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		Stack rhymer = new IntArrayStack();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.push(testValue);

		result = rhymer.pop();
		Assert.assertEquals(testValue, result);
		result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
