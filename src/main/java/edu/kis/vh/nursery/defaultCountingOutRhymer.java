package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!checkIfIsFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean checkIfIsFull() {
        return total == 11;
    }

    protected int getPeekaBoo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
