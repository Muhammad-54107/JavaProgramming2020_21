package Day16_Scanner;

import java.util.Scanner;

public class WarmUpTask {

    /*
    1.  write getPassWord program for getPassWord rate calculator: RateCalculator
            1. asks the user to enter getPassWord salary (double)
            2. asks the user how many weeklyHours he/she works in getPassWord week (as int)
            3. print the hourly rate of the employee

            assume that one year has 52 weeks

            hourRate = salary / (weeklyHour * 52)

     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        System.out.println("Enter your weeklyHours per week");
        int hours = input.nextInt();

        double hourlyRate = salary / (hours * 52);
        System.out.println("Your houly rate is: " + hourlyRate);

    }
}
