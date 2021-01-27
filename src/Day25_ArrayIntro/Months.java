package Day25_ArrayIntro;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] month ={ "jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //                  0       1      2     3      4      5      6     7       8

        System.out.println("Enter the number: ");
        int num = scan.nextInt(); // 4

        System.out.println( month[num-1] );

    }

}
