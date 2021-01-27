package Day50_Polymorphism;

import Day49_Abstraction.RemoteDriverTask.ChromeDriver;
import Day49_Abstraction.RemoteDriverTask.CybertekDriver;
import Day49_Abstraction.RemoteDriverTask.FireFoxDriver;
import Day49_Abstraction.RemoteDriverTask.WebDriver;
import Day49_Abstraction.ShapeTask.Circle;
import Day49_Abstraction.ShapeTask.Cube;
import Day49_Abstraction.ShapeTask.Rectangle;
import Day49_Abstraction.ShapeTask.Shape;
import Day50_Polymorphism.PhoneTask.Iphone;
import Day50_Polymorphism.PhoneTask.Phone;
import Day50_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismIntro {

    public static void main(String[] args) {

       // Iphone iphone1 = new Iphone("IPhone 12", "Small", "Black", 1000);

       // Samsung samsung1 = new Samsung("Glaxy S20", "Medium", "White", 900);

        Phone phone1 = new Samsung("Galaxy S21", "Medium", "White", 1100);

        Phone phone2 = new Iphone("IPhone 12", "Small", "Black", 1000);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add( new Iphone("Iphone 11", "Small", "Black", 1000));
        phones.add(new Samsung("Galaxy 19", "Medium", "White", 1100));

        //LIst <Integer> list = new ArrayList<>();

        Shape shape;

       // shape = new Circle(3);
       // shape = new Rectangle(3, 4);
        shape = new Cube(5);

        System.out.println(shape.area());


        System.out.println("==============================");
        String browserName = "cybertek";

        WebDriver driver;

        switch (browserName){
            case "firefox":
                driver = new FireFoxDriver();
                break;

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "cybertek":
                driver = new CybertekDriver()  ;
                break;


            default:
                throw new RuntimeException("Invalid browser Name");

        }


    }
}
