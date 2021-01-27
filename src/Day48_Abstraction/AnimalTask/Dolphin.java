package Day48_Abstraction.AnimalTask;

public final class Dolphin extends Animal implements Swimmable, Playable{
    public Dolphin(String name, String bread, String size, char gender, int age) {
        super(name, bread, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin sleeps 11 hours");
    }

    @Override
    public void Swimmable() {
        System.out.println("Dolphin can swim 10 hours");
    }

    @Override
    public void play() {
        System.out.println("Play with human");
    }
}
