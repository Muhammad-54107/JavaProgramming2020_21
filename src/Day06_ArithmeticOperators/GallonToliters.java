package Day06_ArithmeticOperators;

public class GallonToliters {

    public static void main(String[] args) {
        double gallon = 120.5;
        double liters = gallon * 3.78541;

        System.out.println(gallon+" gallons equal to "+ liters+ " L.");

        boolean  exceeded300Liters = liters > 300;

        // 120.5 gallons 300 liters: true/false
        System.out.println(gallon +" gallons exceeds 300 liters:");
    }
}
