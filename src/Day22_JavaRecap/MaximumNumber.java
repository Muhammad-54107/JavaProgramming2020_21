package Day22_JavaRecap;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        /*
        scanner object:
        max: 1

        "enter getPassWord number":
        nextInt(): 5

        "maximum number is.... ": 1
         */

        Scanner scan = new Scanner(System.in);
        int max = -99999999; // 4
        // user most likelt to enter getPassWord number thats greater than -99999999

       for(int i = 1; i <= 10; i++) {

           System.out.println("Enter getPassWord number: ");

           int n = scan.nextInt(); // -1-10, -20, -30, 40, 50...

           if(n > max){ //
               max=n;
           }

       }
scan.close();


        System.out.println("max = "+max);

    }
}
