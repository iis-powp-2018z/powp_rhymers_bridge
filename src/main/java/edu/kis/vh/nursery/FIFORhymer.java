package edu.kis.vh.nursery;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {
    private final Stack temp = new IntArrayStack();


    public FIFORhymer() {
    }

    public FIFORhymer(IntLinkedList list) {
        super(list);
    }

    @Override
    public int countOut() {
        while (!callCheck())

        {
            temp.push(super.countOut());
        }
        int ret = temp.pop();
        while (!temp.isEmpty())
        {
            countIn(temp.pop());
        }
         return ret;
    }
}

//// Uważam, że najlepszym wyborem będzie IntArrayStack , ponieważ potrzebujemy najnowszej wartości. 

