package Day17_String;

import java.lang.String; //this package is always automatically imported

public class String_memory {

    public static void main(String[] args) {

       /*
                       String pool:
     strOne --->           "java"           <--- strTwo


                Heap:
                    "java"   <---strThree
                    "java"   <----strFour
        */

        String strOne = "java"; // literal
        String strTwo = "java"; // literal
        String strThree = new String( "java");
        String strFour = new String( "java");

        System.out.println(strOne == strTwo); // true
        System.out.println(strOne == strThree); // false


        System.out.println(strThree == strFour); //false


        String strFive = "Java"; // made in string pool

        System.out.println(strOne == strFive); //false










    }
}
