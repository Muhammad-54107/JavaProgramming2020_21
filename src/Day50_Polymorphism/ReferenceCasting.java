package Day50_Polymorphism;

import Day42_Inheritance.AnimalTask.Cat;
import Day47_Abstraction.ShapeTasks.Circle;
import Day48_Abstraction.AnimalTask.Animal;
import Day48_Abstraction.AnimalTask.Dog;
import Day49_Abstraction.RemoteDriverTask.ChromeDriver;
import Day49_Abstraction.RemoteDriverTask.WebDriver;
import Day49_Abstraction.ShapeTask.Shape;

public class ReferenceCasting {

        public static void main(String[] args) {
            // implicit casting: smaller to larger. done automatically
            int a = 10;
            double b =a;

            // explicit casting: larger to smaller. MUST be done manually
            double d = 10.5;
            int c = (int)d;

/*
            System.out.println("======================================");
            // up casting: smaller reference type to larger reference type
            Circle circle = new Circle(3);
            Shape shape = (Shape)circle;

            WebDriver driver = new ChromeDriver();


            // down casting: larger reference type to the smaller
            Animal animal =  new Dog("Lucy", "Husky", 'M',12, "White", "Small");  // upcasting
            Dog dog = (Dog)animal;
            dog.bark();

            Animal animal2 = new Cat("Lucy", "Husky", 'M',12, "White", "Small");
            //  ( (Cat)animal2  ).meow();
            ( (Cat) animal2 ).meow();

            System.out.println("================================================");



 */


        }


    }
