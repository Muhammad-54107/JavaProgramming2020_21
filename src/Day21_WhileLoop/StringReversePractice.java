package Day21_WhileLoop;

import java.util.Scanner;

public class StringReversePractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter as String");
        String word = scan.nextLine(); // "Java"
                                       //  0123
        String reverseWord = "";

        int lastIndex = word.length() -1 ;
        for(int i = lastIndex;  i >= 0; i--){
           //  System.out.print(  word.charAt(i) );
            reverseWord += word.charAt(i);
        }

        System.out.println( reverseWord);

        Boolean isPalindrome = word.equalsIgnoreCase(reverseWord);
        System.out.println(isPalindrome);



    }
}
