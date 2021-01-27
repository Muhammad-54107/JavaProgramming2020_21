package Day40_Constructor;

public class ConstructorIntro {
    static int b;

    static{
        System.out.println("static block");
        b = 200; // 1
    }

    public ConstructorIntro(int a){
        System.out.println("Constructor with int arg");
        b = 200; //
        this.a = a;
    }

    int a ;

    public static void main(String[] args) {
        System.out.println("Hello");
        //System.out.print(getPassWord);

        int num = new ConstructorIntro(200).a; // getPassWord = 200

        ConstructorIntro obj2 = new ConstructorIntro(300); // getPassWord = 300

        ConstructorIntro obj3 = new ConstructorIntro(400); // 400

    }


}
