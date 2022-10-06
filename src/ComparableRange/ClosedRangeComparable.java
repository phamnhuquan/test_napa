package ComparableRange;

public class ClosedRangeComparable<T extends Comparable<T>> extends RangeComparable {

    public ClosedRangeComparable(T lowerbound, T upperbound) {
        super(lowerbound, upperbound);
    }

    @Override
    public boolean contains(Comparable object ) {
        return (object.compareTo((T) this.lowerbound) >= 0 &&  object.compareTo((T) this.upperbound) <= 0);
    }
}
