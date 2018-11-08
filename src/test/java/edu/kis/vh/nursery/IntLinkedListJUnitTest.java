package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * @author damian.a.biedrowski
 * @since 2018-11-08
 * @see https://github.com/dbiedrowski/powp_rhymers_bridge/blob/master/powp-lab-kod.pdf, point 3.3.2
 */
public class IntLinkedListJUnitTest {
	private final int[] testValues = {1, 2};

	/**
	 * Method that tests if push() works correctly
	 */
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

	/**
	 * Method that tests if isEmpty() works correctly
	 */
	@Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertEquals(true, list.isEmpty());
        list.push(testValues[0]);
        Assert.assertEquals(false, list.isEmpty());
    }

	/**
	 * Method that tests if isFull() works correctly
	 */
	@Test
    public void testIsFull() {
//        return false;
    }

	/**
	 * Method that tests if top() works correctly
	 */
	@Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertEquals(IntLinkedList.EMPTY_LIST_INDICATOR, list.top());
        list.push(testValues[0]);
        Assert.assertEquals(testValues[0], list.top());
    }

	/**
	 * Method that tests if pop() works correctly
	 */
	@Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertEquals(IntLinkedList.EMPTY_LIST_INDICATOR, list.pop());
        list.push(testValues[0]);
        Assert.assertEquals(testValues[0], list.pop());
        Assert.assertEquals(IntLinkedList.EMPTY_LIST_INDICATOR, list.pop());
    }
}
