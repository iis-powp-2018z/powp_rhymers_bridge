package edu.kis.vh.nursery;

import org.junit.Test;

public class FIFORhymerJUnitTest {

    @Test
    public void testCountOut() {
    	/*
    	 * The parent (DefaultCountingOutRhymer) test can be used because the child 
    	 * does not provide new return value logic
    	 * */
        final DefaultCountingOutRhymerJUnitTest defaultRhymerTest = new DefaultCountingOutRhymerJUnitTest();
        final FIFORhymer fifoRhymer = new FIFORhymer();

        defaultRhymerTest.testCountOutHelper(fifoRhymer);
    }
}
