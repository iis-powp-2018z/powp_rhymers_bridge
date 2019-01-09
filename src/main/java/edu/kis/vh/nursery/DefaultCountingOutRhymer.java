package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public void countIn(int in) {
        oldRhymer.countIn(in);
    }

    public boolean callCheck() {
        return oldRhymer.callCheck();
    }

    public boolean isFull() {
        return oldRhymer.isFull();
    }

    public int peekaboo() {
        return oldRhymer.peekaboo();
    }

    public int countOut() {
        return oldRhymer.countOut();
    }

    public int getTotal() {
        return oldRhymer.getTotal();
    }

    private IntArrayStack oldRhymer = new IntArrayStack();

    public DefaultCountingOutRhymer(IntArrayStack oldRhymer) {
        this.oldRhymer = oldRhymer;
    }

    public DefaultCountingOutRhymer() {
    }

}
