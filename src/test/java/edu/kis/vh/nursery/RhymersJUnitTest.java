package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    private static final int TEST_VALUE = 4;
    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_VALUE = 0;

    public static int getTestValue() {
        return TEST_VALUE;
    }

    public static int getStackCapacity() {
        return STACK_CAPACITY;
    }

    public static int getEmptyStackValue() {
        return EMPTY_STACK_VALUE;
    }

    @Test
    public void testCountIn() {
        IntArrayStack rhymer = new IntArrayStack();
        rhymer.push(getTestValue());

        int result = rhymer.top();
        Assert.assertEquals(getTestValue(), result);
    }

    @Test
    public void testCallCheck() {
        IntArrayStack rhymer = new IntArrayStack();
        boolean result = rhymer.isEmpty();
        Assert.assertEquals(true, result);

        rhymer.push(888);

        result = rhymer.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        IntArrayStack rhymer = new IntArrayStack();
        for (int i = 0; i < getStackCapacity(); i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.push(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        IntArrayStack rhymer = new IntArrayStack();

        int result = rhymer.top();
        Assert.assertEquals(getEmptyStackValue(), result);

        rhymer.push(getTestValue());

        result = rhymer.top();
        Assert.assertEquals(getTestValue(), result);
        result = rhymer.top();
        Assert.assertEquals(getTestValue(), result);
    }

    @Test
    public void testCountOut() {
        IntArrayStack rhymer = new IntArrayStack();

        int result = rhymer.pop();
        Assert.assertEquals(getEmptyStackValue(), result);
        rhymer.push(getTestValue());
        result = rhymer.pop();
        Assert.assertEquals(getTestValue(), result);
        result = rhymer.pop();
        Assert.assertEquals(getEmptyStackValue(), result);
    }
//kombinacja alt + strzalka pozwala nam sie przelaczaj pomiedzy kartami klas
}
