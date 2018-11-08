package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.list.IntLinkedList;

public class IntLinkedListJUnitTest {
	private final int[] testValues = {1, 2};

	@Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertEquals(true, list.isEmpty());
        list.push(testValues[0]);
        Assert.assertEquals(false, list.isEmpty());
        Assert.assertEquals(testValues[0], list.top());
        list.push(testValues[1]);
        Assert.assertEquals(testValues[1], list.pop());
        Assert.assertEquals(testValues[0], list.pop());
    }

	@Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertEquals(true, list.isEmpty());
        list.push(testValues[0]);
        Assert.assertEquals(false, list.isEmpty());
    }

	@Test
    public void testIsFull() {
//        return false;
    }

	@Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertEquals(IntLinkedList.EMPTY_LIST_INDICATOR, list.top());
        list.push(testValues[0]);
        Assert.assertEquals(testValues[0], list.top());
    }

	@Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertEquals(IntLinkedList.EMPTY_LIST_INDICATOR, list.pop());
        list.push(testValues[0]);
        Assert.assertEquals(testValues[0], list.pop());
        Assert.assertEquals(IntLinkedList.EMPTY_LIST_INDICATOR, list.pop());
    }
}
