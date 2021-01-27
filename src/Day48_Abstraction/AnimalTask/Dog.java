package Day48_Abstraction.AnimalTask;

public final class Dog extends Animal implements Playable, Swimmable{

    public Dog(String name, String bread, String size, char gender, int age) {
        super(name, bread, size, gender, age);
    }



    @Override
    public void sleep() {
        System.out.println("Dog sleeps 8 hours");
    }

    @Override
    public void play() {
        System.out.println("Dog plays with kids");
    }


    @Override
    public void Swimmable() {

    }
}
