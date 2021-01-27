package Office_Hours.Pratice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        String gender = scan.next(); // FemaleEnter

        System.out.println("Enter your age:");
        int age = scan.nextInt(); // 28Enter

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fulName = scan.nextLine(); // EnterEnter

        System.out.println("Enter your zip code: ");
        String zipCode = scan.next(); // 22035

        scan.nextLine(); // Enter

        System.out.println("Enter your country name:");
        String countryName = scan.nextLine(); // Enter

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble(); // 1100000

        scan.nextLine(); // Enter

        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine(); // Bano of America

        System.out.println("Enter your address: ");
        String address = scan.nextLine();







    }

}


/*
1. ask gender ( next() )
2. ask age (  nextInt() )
3. ak full name (  nextLine() )
4. ask zip code (  nextInt()  )
5. ask country name (   nextLine()  )
6. ask salary (    nextDouble()  )
7. ask company name (   nextLine() )
8. ask address (  nextLine() )


/we need this extra nextLine whenever we are using nextLine() method after other scanner
 */