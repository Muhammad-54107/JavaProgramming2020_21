package Day41_Encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person p1 = new Person("Jimmy", 19, 'M');
        // System.out.println(p1.name);
        System.out.println( p1.getName() );

        p1.setName("Breanna");
        p1.setGender('F');
        p1.setAge(23);

        System.out.println( p1.getName() );
        System.out.println( p1.getGender());
        System.out.println( p1.getAge() );


        //      Person p2 = new Person("Breanna", 23, 'F');


    }

}

