package Day22_JavaRecap;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {
        /*
        substring: creates substring from string
            substring(beg, end): creates substring from begning index till the givenending index (excluded)
            substring(beg):
             */

        String sentence = "My name is Cybertek";
        //

        String name1 = sentence.substring(11, sentence.length() );
        System.out.println(name1);

        String name2 = sentence.substring(11);
        System.out.println(name2);

        String str1 = "Thursday is cool, it's getPassWord fun day";
        //             012345

        String day1 = str1.substring(0, 6);
        System.out.println(day1); // Thursd

        String day2 = str1.substring(0,str1.indexOf(" "));
        System.out.println(day2);

        String s1 = "https://www.amazon.com"; // .com , .edu , .net , .gov

        String domain = s1.substring( s1.lastIndexOf(".")+1 );
        System.out.println(domain);

        String name = s1.substring( s1.indexOf(".")+1, s1.lastIndexOf(".") );

        System.out.println(name);

        name = name.substring(0,1).toUpperCase() + name.substring(1); //"Amazon

        System.out.println(name);

        System.out.println("========================================================");

            Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first name: ");
                            //c Y B Er Tek=> c y b er => cybertek
            String firstName = scan.nextLine().toLowerCase().replace(" ","");

        System.out.println("Enter you last name: ");
                             // sCH O O L ==> sch o o l ==> school
            String lastName = scan.nextLine().toLowerCase().replace(" ", "");
            scan.close();

            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1); // "Cybertek"
            lastName = lastName.substring(0, 1).toUpperCase()+ lastName.substring(1);

            String fulLName = firstName+" "+lastName;

        System.out.println("Full Name = " + fulLName);





    }
}
