package edu.kis.vh.nursery;
/*
        metoda getTotal zwraca najstarsza wartosc w stosie, albo -1 kiedy stos jest pusty
        metoda callCheck sprawdza czy stos jest pusty
        metoda isFull sprawdza czy stos jest pelny
        metody countIn i countOut odpowiednio dodają i usuwają element ze stosu
*/
public class DefaultCountingOutRhymer {
    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_RHYTMER_INDICATOR = -1;
    private static final int DEFAULT_VALUE = -1;
    final private int[] numbers = new int[STACK_CAPACITY];

    public int total = EMPTY_RHYTMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYTMER_INDICATOR;
    }

    public boolean isFull() {
        return total == STACK_CAPACITY-1;
    }

    protected int getTotal() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }
    

    public int getTotal(int total) {
         return this.total;
    }
}
