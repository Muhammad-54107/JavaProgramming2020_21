package Day05_Concatenation;

public class Concatenation_Pratice {

    public static void main(String[] args) {

         int houseNumber = 7925;
        String streetName = "Johns Branch Dr";
        String cityName = "McLean";
        String state = "VA";
        int zipCode = 22000;

        String fullAddress = houseNumber+" "+streetName+"\n "+ cityName+" "+state+", "+zipCode;

        System.out.println(fullAddress);

        System.out.println("=================================");
        String brand = "BMW";
        String model = "X7";
        int year = 2012;
        int mileage = 20000;
        double price = 45000;
        String color = "Red";

        // 2010 Toyota Camry, 55000 miles, Red, $1800
        String carInfo = year+" "+brand+" "+model+", "+mileage+" miles, "+color+", $"+price; // concentration

        System.out.println(carInfo);





    }
}
