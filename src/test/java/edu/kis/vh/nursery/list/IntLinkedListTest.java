package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

	@Test
	public void testPush() {
		IntLinkedList list = new IntLinkedList();
		int testValue = 4;

		list.push(testValue);

		int result = list.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPushWhenListNotEmptyShouldReturnCorrectValue() {
		IntLinkedList list = new IntLinkedList();
		list.push(3);
		int testValue = 4;
		list.push(testValue);

		int result = list.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		IntLinkedList list = new IntLinkedList();
		int testValue = 4;

		list.push(testValue);

		int result = list.pop();
		Assert.assertEquals(testValue, result);

		boolean empty = list.isEmpty();
		Assert.assertEquals(empty, true);
	}
}
