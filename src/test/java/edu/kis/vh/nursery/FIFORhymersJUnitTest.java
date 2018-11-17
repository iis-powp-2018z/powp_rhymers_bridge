package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ListRhymersFactory;
import org.junit.Assert;
import org.junit.Test;

public class FIFORhymersJUnitTest  extends RhymersTest {


    public FIFORhymersJUnitTest() {
        super(new ListRhymersFactory());
    }

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = rhymersFactory.getFIFORhymer();
        rhymer.countIn(TEST_VALUE);

        int result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = rhymersFactory.getFIFORhymer();
        boolean result = rhymer.callCheck();
        Assert.assertTrue(result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = rhymersFactory.getFIFORhymer();
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
        DefaultCountingOutRhymer rhymer = rhymersFactory.getFIFORhymer();

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
        rhymer.countIn(TEST_VALUE);

        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = rhymersFactory.getFIFORhymer();

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(TEST_VALUE);
        rhymer.countIn(TEST_VALUE_2);

        result = rhymer.countOut();
        Assert.assertEquals(TEST_VALUE, result);


        result = rhymer.countOut();
        Assert.assertEquals(TEST_VALUE_2, result);

        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
