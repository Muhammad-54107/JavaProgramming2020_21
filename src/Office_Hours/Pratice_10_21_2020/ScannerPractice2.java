package Office_Hours.Pratice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //EnterEnter
        System.out.println("Enter getPassWord price");
        double price = scan.nextDouble(); // 80Enter
        System.out.println("Price: "+price);

        System.out.println("enter the name of the item: ");
        String item =    scan.next(); // tomato
        System.out.println("Item: "+ item);

        scan.nextLine(); //EnterEnter
        // we need this extra netLine whever we are using nextLine method

        System.out.println("Enter your full name: ");
        String fulName = scan.nextLine(); // Cybertek School

        System.out.println("Full Name: "+fulName);





    }
}
