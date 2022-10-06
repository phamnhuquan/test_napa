package test;

import ComparableRange.RangeComparable;
import main.Range;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {

    @Test
    void isValidAgesForHighSchool(){
        var range = Range.of(5,7);
        assertTrue(range.contains(6));
    }

    @Test
    void isValidOpen(){
        var range = Range.open(2,7);
        assertTrue(range.contains(6));
    }
    //Test mở rộng
    @Test
    void isValidOpenComparable(){
        var range = RangeComparable.open(2,7);
        assertTrue(range.contains(6));
    }

    @Test
    void isValidClosed(){
        var range = Range.closed(8,12);
        assertTrue(range.contains(7));
    }

    //Test mở rộng
    @Test
    void isValidClosedComparable(){
        var range = RangeComparable.closed(2,7);
        assertTrue(range.contains(6));
    }

    @Test
    void isValidOpenClosed(){
        var range = Range.openClosed(5,10);
        assertTrue(range.contains(6));
    }

    @Test
    void isValidClosedOpen(){
        var range = Range.closedOpen(5,7);
        assertTrue(range.contains(5));
    }

}