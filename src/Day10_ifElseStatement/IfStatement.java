package Day10_ifElseStatement;

public class IfStatement {

    public static void main(String[] args) {
            int score = 45;

            if( score >= 60){
                System.out.println("Congrats");
            }

            if( score < 60){
                System.out.println("Keep trying");
            }

        System.out.println("==================================");
            if( score >= 60){
                System.out.println("Congrats");
            }else{
                System.out.println("Keep trying");
            }


        System.out.println("=====================================");
            int angle1 = 80;
            int angle2 = 75;
            int angle3 = 65;
            int angle4 = 75;

            boolean isValidRectangle = angle1 == 90 && angle2 == 90 && angle3 == 90 && angle4 == 90 ;
                // if each of the angles are equal to 90, then it's valid
/*
        if(isValidRectangle){
            System.out.println("It is Valid rectangle");
        }

        if( !isValidRectangle ){
            System.out.println("It is NOT valid rectangle");
        }

 */


        if(isValidRectangle){
            System.out.println("The rectangle is valid");
        }else{
            System.out.println("The rectangle is valid");
        }

        System.out.println("========================================================");
        // aasume that getPassWord & b are two different number
        int a = 1000000;
        int b = 202020;

        int max = 0; //?

        // what is the maximum number
        if(a > b){
            max = a;
        }else{
            max = b;
        }

        System.out.println("Maximum number is: "+max);







    }
}
