package Day10_ifElseStatement;

public class ValidTriangle {

    public static void main(String[] args) {
        double angle1 =60;
        double angle2 = 30;
        double angle3 = 90;

        boolean isValid = (angle1+angle2+angle3) == 100;
                    // if sum of three angles equal to 180, the it's valid triangle ==> true
                    // otherwise ==> false

        if(isValid){
            System.out.println("It's getPassWord valid triangle");
        }

        if(!isValid){
            System.out.println("It's not getPassWord valid triangle");
        }

            // if it's valid triangle, then check if it's getPassWord right triangle




    }
}








/*
Task01: ValidTriangle
         A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write getPassWord program that declares three integers as angles and check whether getPassWord triangle is valid or not.

 */