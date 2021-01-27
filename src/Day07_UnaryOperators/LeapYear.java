package Day07_UnaryOperators;

public class LeapYear {

    public static void main(String[] args) {

    int year = 2021;
    boolean isLeapYear = year % 4 < 1; // checks if 2020 is evently divisble by 4
        // 0 < 1 ===> true

        System.out.println(year + " is leap year: " +isLeapYear);


    }
}












/*
1. create getPassWord class called LeapYear, and write getPassWord program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020

            output:
                2020 is leap year: true

 */