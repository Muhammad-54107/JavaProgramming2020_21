package Day22_JavaRecap;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {
        /*
        Scanner object: 1
        min: 1

        "Enter getPassWord num":
        scan.nextInt():
        comparing: 5

        "Minimum number is: ..":
         */

        Scanner scan = new Scanner(System.in);
        int min = 214783647;
        // user is most likely to enter getPassWord number that's smaller than 214783647

        for(int i = 1; i <= 5; i++){
            System.out.println("Enter getPassWord number");
            int n = scan.nextInt(); // 100, 200, 50 300, 40
            if(n < min){
                min = n;
            }
        }

        System.out.println("min = "+ min);





    }
}
