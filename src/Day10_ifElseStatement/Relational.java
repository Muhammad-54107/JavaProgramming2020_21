package Day10_ifElseStatement;

/*
rational operators
 */


public class Relational {

    public static void main(String[] args) {


        System.out.println(10 > 100 ); // false

        System.out.println(100 < 10); // false

        System.out.println(10000 > 20); // true

        System.out.println(20 < 10000); // true

        System.out.println( 10 >= 8); // greater or equal ==> true

        System.out.println(9 >=9); //

        System.out.println( 10 <= 10); // less or equal ==> true





            // ==:
        int a1 = 20;
        int a2 = 30;
        int a3 = 30;

        System.out.println(a1 == a2); // false

        System.out.println( a2 == a3); // true

        char ch1 = '!';
        char ch2 = '!';

        System.out.println(ch1 == ch2); // true

        String language1 = "Turkish";
        String language2 = "Indian";
        String language3 = "turkish";

        System.out.println( language1 == language2); //false
        System.out.println(language1 == language3); //false

        System.out.println("Russain" == "English");


        // !=

        System.out.println("Russian Language" == "Japense language"); //false
        System.out.println("Russian Language" != "Japense language"); //true

        System.out.println(20 != 20); // false

        System.out.println( 'a' );




    }
}
