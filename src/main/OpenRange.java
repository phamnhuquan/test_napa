package main;

public class OpenRange extends Range{

    public OpenRange(int lowerbound, int upperbound) {
        super(lowerbound, upperbound);
    }
    @Override
    public boolean contains(int number) {
         return (number > this.lowerbound && number < this.upperbound);
    }
}
