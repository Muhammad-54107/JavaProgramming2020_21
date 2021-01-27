package Day48_Abstraction.AnimalTask;

public abstract class Animal {

    public String name, bread, size;
    public char gender;
    public int age;

    public Animal(String name, String bread, String size, char gender, int age) {
        this.name = name;
        this.bread = bread;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public abstract void sleep();


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }




}
