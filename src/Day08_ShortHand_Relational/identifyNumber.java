package Day08_ShortHand_Relational;

public class identifyNumber {

    public static void main(String[] args) {
        int number = -100;
        boolean isPositive = number > 0; // if number is greater than zero then it is positive
        boolean isNegative = number < 0; // if number is less than zero then it is negative
        boolean isZero = number == 0; // if the number is equal to zero, then it's zero

        System.out.println( number+ " is positive number: " +isPositive);
        System.out.println( number+ " is negative number: " +isNegative);
        System.out.println( number+ " is zero: "+isZero);
    }


}


/*
 number = 100

 output:
        100 is positive number: true
        100 is negative number: false
        200 is zero: false
 */




