package Day26_Arrays;

import java.util.Scanner;

public class MinMazInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();

        double[] numbers = new double[length];

        for(int i = 0; i <= length-1; i++){ // gets the user inputs and store into the array starting from int
            System.out.println("Enter getPassWord number");
            numbers[i] = scan.nextInt();
        }

        double min = numbers[0];
        double max = numbers[0];

        for(int i = 0 ; i <= length-1; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }

            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("max = "+max);
        System.out.println("Min = "+min);

        /*

4. finding min and max from array

         */




    }

}
