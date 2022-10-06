package ComparableRange;
//#3 Make it generic with all Comparable<T> types
public abstract class RangeComparable <T extends Comparable<T>> implements Comparable<T>{

    protected T lowerbound;
    protected T upperbound;

    public RangeComparable(T lowerbound, T upperbound) {
        super();
        this.lowerbound = lowerbound;
        this.upperbound = upperbound;
    }

    public static <E extends Comparable<E>> RangeComparable<E> open(E lowerbound, E upperbound) {
        if (lowerbound.compareTo(upperbound) > 0) {
            throw new RuntimeException("Can't allowed to create a Range with lowerbound > upperbound !!!");
        }
        return new OpenRangeComparable<>(lowerbound, upperbound);
    }

    public static <E extends Comparable<E>> RangeComparable<E> closed(E lowerbound, E upperbound) {
        if (lowerbound.compareTo(upperbound) > 0) {
            throw new RuntimeException("Can't allowed to create a Range with lowerbound > upperbound !!!");
        }
        return new ClosedRangeComparable<>(lowerbound, upperbound);
    }

    public abstract boolean contains(T object );

    @Override
    public int compareTo(T o) {
        // TODO Auto-generated method stub
        return 0;
    }

}