package main;

public class ClosedOpenRange extends Range {

    public ClosedOpenRange(int lowerbound, int upperbound) {
        super(lowerbound, upperbound);
    }
    @Override
    public boolean contains(int number) {
        return (number >= this.lowerbound && number < this.upperbound);
    }
}
