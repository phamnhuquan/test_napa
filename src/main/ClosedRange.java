package main;

public class ClosedRange extends Range {

    public ClosedRange(int lowerbound, int upperbound) {
        super(lowerbound, upperbound);
    }
    @Override
    public boolean contains(int number) {
        return (number >= this.lowerbound && number <= this.upperbound);
    }
}
