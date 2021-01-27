package Day04_Variables;

public class CalculateCircle {

    public static void main(String[] args) {
        // r: 15
        double r = 15 ;
        double pi = 3.14;

        double area = r * r * pi;
        double perimeter = 2 * r * pi;

        System.out.println( "Area of the circle is: ");
        System.out.println(area);

        System.out.println("Perimeter of the circle is: ");
        System.out.println(perimeter);
        System.out.println("=========");
        System.out.println( (int) (10.0/3) );


        System.out.println("5 + 2 =" + (3 + 4));






    }


}


/*
Write getPassWord program that can calculate the area and perimeter of the circle based on the given redius


            hints: Area of the Circle = r * r * PI
                    Perimeter of circle = 2 * r * PI

 */