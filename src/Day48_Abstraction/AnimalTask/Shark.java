package Day48_Abstraction.AnimalTask;

public final class Shark extends Animal implements Predator, Swimmable {

    public Shark(String name, String bread, String size, char gender, int age) {
        super(name, bread, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Shark sleeps 0 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Shark hunts fish");
    }

    @Override
    public void Swimmable() {
        System.out.println("Shark can swim 20 hours");
    }
}
