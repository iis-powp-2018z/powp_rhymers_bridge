package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.Stack;

/**
 * @version 1.0
 * Klasa FIFORhymer jest potomkiem klasy DefaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {
    /**
     *Tworzymy obiekt intrefejsu
     */
    private Stack temp = new IntArrayStack();

    /**
     * Konstruktor
     * @param list
     */

    public FIFORhymer(Stack list) {
        super(list);
    }

    /**
     * Konstruktor domyslny
     */

    public FIFORhymer() {

    }

    /**
     *
     * @return ret zwraca ostatnia zdjeta wartosc
     */
    @Override
    protected int countOut() {
        while (!callCheck())

            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop());

        return ret;
    }
//w przypadku gdy wielkosc tablicy jest okreslona najlepszym wyborem jest IntArrayStack,
// poniewaz potrzebujemy ostatniej wartosci, a tablica wymaga mniej zasobow i jest "szybsza"

}
