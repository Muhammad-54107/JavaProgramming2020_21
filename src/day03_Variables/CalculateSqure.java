package day03_Variables;

/*
declare variables:
        DataType name = Data;
*/

public class CalculateSqure {

    public static void main(String[] args) {

      // sides: 10
      int side = 100; // to make it reuseable

      int area = side * side; // another info that we gained by using side
        // side to make it reuseable

        int perimeter = side * 4; // another info that we gained by using side

        System.out.println("Area of Square is: ");
        System.out.println(area);

        System.out.println("perimeter of Square is:");
        System.out.println(perimeter);


    }

}
