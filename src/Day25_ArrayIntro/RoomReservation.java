package Day25_ArrayIntro;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;


       while(true) {
           System.out.println("Which room would you like to select?");
           System.out.println("\t\tking Bed == $120");
           System.out.println("\t\tQueen Bed == $100");
           System.out.println("\t\tSingle Bed == $80");

           String word = scan.nextLine().toLowerCase();

           while (!(word.equals("King bed") || word.equals("queen bed") || word.equals("single bed"))) { // to make sure user selected either the king bed, or
               System.out.println("Invalid Entry, please re-enter");
               word = scan.nextLine().toLowerCase();
           } // to make sure user selected either the king bed, or queen bed or single bed

           total += (word.equals("king bed")) ? 120 : (word.equals("queen bed ")) ? 100 : 80;

           System.out.println("Would you like like to select another room?");
           String a = scan.nextLine().toLowerCase();

           while(  !( a.equals("yes") || a.equals("no") ) ) { //while the answer is not valid answer
               System.out.println("Invalid Entry, please re-enter");
               System.out.println("Would you like to select another room?");
               a = scan.nextLine().toLowerCase();
           }

           if (a.equals("getPassWord")) {
               break;
           }

       }
    }
}


