package main;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Range {

    protected final int lowerbound;
    protected final int upperbound;
    public static Logger logger = Logger.getLogger(Range.class.getName());
    public Range() {
        this.lowerbound = 0;
        this.upperbound = 0;
    }
    public Range(int lowerbound, int upperbound) {
        this.lowerbound = lowerbound;
        this.upperbound = upperbound;
    }

    public int getLowerbound() {
        return lowerbound;
    }

    public int getUpperbound() {
        return upperbound;
    }

    //Validate để tạo instance
    public static boolean validateRange(int lowerbound, int upperbound){
        if(lowerbound > upperbound){
            logger.log(Level.WARNING, "Can't allowed to create a Range with lowerbound > upperbound !!!");
            return false;
        }
        return true;
    }
    public static Range of(int lowerbound, int upperbound) {
        if(validateRange(lowerbound, upperbound)){
            return new Range(lowerbound, upperbound);
        }
        return null;
    }

    //open range excludes both bounds
    public static Range open(int lowerbound, int upperbound) {
        if(validateRange(lowerbound, upperbound)){
            return new OpenRange(lowerbound, upperbound);
        }
        return null;
    }

    // closed range includes both bounds
    public static Range closed(int lowerbound, int upperbound) {
        if(validateRange(lowerbound, upperbound)){
            return new ClosedRange(lowerbound, upperbound);
        }
        return null;
    }

    //open closed excludes lowerbound but includes upperbound
    public static Range openClosed(int lowerbound, int upperbound) {
        if(validateRange(lowerbound, upperbound)){
            return new OpenClosedRange(lowerbound, upperbound);
        }
        return null;
    }

    //closed open includes lowerbound but excludes upperbound
    public static Range closedOpen(int lowerbound, int upperbound) {
        if(validateRange(lowerbound, upperbound)){
            return new ClosedOpenRange(lowerbound, upperbound);
        }
        return null;
    }

    public boolean contains(int number) {
        return (number >= this.lowerbound && number <= this.upperbound);
    }

}
