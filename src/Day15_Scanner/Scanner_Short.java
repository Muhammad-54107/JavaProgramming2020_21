package Day15_Scanner;

import java.util.Scanner;

public class Scanner_Short {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter getPassWord short number:");

        short s = scan.nextShort();
        System.out.println("Number is: " + s);

        System.out.println(scan.nextShort());

    }


}
