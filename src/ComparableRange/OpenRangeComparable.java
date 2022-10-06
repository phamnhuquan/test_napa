package ComparableRange;


public class OpenRangeComparable<T extends Comparable<T>> extends RangeComparable {

    public OpenRangeComparable(T lowerbound, T upperbound) {
        super(lowerbound, upperbound);
    }

    @Override
    public boolean contains(Comparable object ) {
        return (object.compareTo((T) this.lowerbound) > 0 &&  object.compareTo((T) this.upperbound) < 0);
    }
}
