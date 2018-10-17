package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.CollectionImpl;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final CollectionImpl col = new IntLinkedList();

    public FIFORhymer(String type) {
        super(type);
    }

    public FIFORhymer() {
        super();
    }

	@Override
	protected int countOut() {
		while (!callCheck()) {
            col.push(super.countOut());
		}

        int ret = col.pop();

        while (!col.isEmpty()) {
            countIn(col.pop());
		}
		
		return ret;
	}
}
