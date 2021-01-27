package Office_Hours.Pratice_11_04_2020;

public class SliceNumbers {

    public static void main(String[] args) {
        int number = 12345;

        int digit1 = number / 10000 ;
                //   12345 /  10000  1.2345
                //     1

        int digit2 = number % 10000 / 1000;
         //          12345  % 10000 / 1000
        //                  2345  / 1000  = 2.345
        //                    2

        int digit3 = number % 10000  % 1000   /   100;
                    //  2345 % 1000 / 100
                    //  345 / 100   = 3.45
                    //      3

        int digit4 = number % 10000 % 1000 % 100 / 10 ;
                         // 345 % 1000 / 10
                        //  45 / 10  = 4.5
                        //  4

        int digit5 = number % 10000 % 1000 % 100 % 10;
                     // 45  % 10
                    // 5


        System.out.println("Digit1 = "+ digit1);
        System.out.println("Digit2 = "+ digit2);
        System.out.println("Digit3 = "+ digit3);
        System.out.println("Digit4 = "+ digit4);
        System.out.println("Digit5 = "+ digit5);





    }
}
