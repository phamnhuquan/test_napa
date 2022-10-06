package ComparableRange;


import java.math.BigDecimal;

import static ComparableRange.RangeComparable.*;

public class MainComparable {
    public static void main(String[] args) {
        RangeComparable<Integer> open = open(5,7);
        System.out.println(open.contains(7));

        RangeComparable<String> text = open("abc", "xyz");
        System.out.println(text.contains("abd"));

        RangeComparable<BigDecimal> decimals = open(BigDecimal.valueOf(Long.parseLong("1.123")), BigDecimal.valueOf(Long.parseLong("1.23456789")));
        System.out.println(decimals.contains(BigDecimal.valueOf(Long.parseLong("1.1235"))));

    }
}