package main;

public class OpenClosedRange extends Range{

    public OpenClosedRange(int lowerbound, int upperbound) {
        super(lowerbound, upperbound);
    }
    @Override
    public boolean contains(int number) {
        return (number > this.lowerbound && number <= this.upperbound);
    }
}
