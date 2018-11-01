package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer dcor = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!isEmpty())

            dcor.countIn(super.countOut());

        int value = dcor.countOut();

        while (!dcor.isEmpty())

            countIn(dcor.countOut());

        return value;
    }
}
