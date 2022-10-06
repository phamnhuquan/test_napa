package main;

public class Main {
    public static void main(String[] args) {
        Range validAgesForHighSchool = Range.of(12, 18);
        System.out.println(validAgesForHighSchool.contains(14)); // true

        Range open = Range.open(5, 7);
        System.out.println(open.contains(5)); //false

        Range closed = Range.closed(5, 7);
        System.out.println(closed.contains(5)); // true

        Range openClosed = Range.openClosed(5, 7);
        System.out.println(openClosed.contains(5)); // false
        System.out.println(openClosed.contains(7)); // true

        Range closedOpen = Range.closedOpen(5, 7);
        System.out.println(closedOpen.contains(5)); // true;
        System.out.println(closedOpen.contains(7)); // false;
    }
}