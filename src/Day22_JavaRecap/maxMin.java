package Day22_JavaRecap;

import java.util.Scanner;

public class maxMin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 214748347;
        int max = -214748348;

        for(int i = 1; i <=5 ; i++){
            System.out.println("Enter getPassWord number");
            int n = scan.nextInt();

            if(n < max){ // if the input is smaller than pervious min number
                min = n;
            }

            if(n > max ){ // if the input is greater than perious max number
              max = n ;
            }


        }
        scan.close();

        System.out.println("min = " + min);
        System.out.println("max = " + max);




    }

}
