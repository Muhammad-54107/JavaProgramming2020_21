package Day29_Mehtods;

public class MethodsWithoutParameters {


    public static void main(String[] args) {

        printHello6Times();
        System.out.println("Muhtar");
        printHello6Times();
        System.out.println("School Name: Cybertek");
        printHello6Times();

       MethodsWithoutParameters.printHello6Times();

    }

    // AccessModifier specifier returnTYPE  MethodName (Parameter)
         public static void printHello6Times(){

            for(int i = 1; i < 6; i++){
                System.out.println("Hello");
            }

         }



}
/*
 step1: print hello 5 times  (for loop)
        step2: print your name
        step3: print hello 5 times  (for loop)
        step4: print your school name
        step5: print hello 5 times   (for loop)
 */