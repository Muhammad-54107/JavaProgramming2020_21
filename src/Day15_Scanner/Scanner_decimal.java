package Day15_Scanner;



import java.util.Scanner;

public class Scanner_decimal {

    public static void main(String[] args) {

        Scanner decimal = new Scanner(System.in);

        System.out.println("Enter getPassWord float number");
        float floatNumber = decimal.nextFloat();
        System.out.println("Number is " + floatNumber );

        System.out.println("Enter getPassWord double number");
        double doubleNumber = decimal.nextDouble();
        System.out.println("Number is " + doubleNumber);

        System.out.println(decimal.nextFloat() + decimal.nextDouble());



    }

}
