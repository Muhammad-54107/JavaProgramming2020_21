package Day41_Encapsulation;

public class LogIn {

    public static void main(String[] args) {
        Credentials obj = new Credentials();

      //  System.out.println( obj.userName);
      //  obj.userName = "ABC";
      //  System.out.println(obj.userName);

        System.out.println( obj.getUserName()  );

        System.out.println( obj.getPassWord());

      // obj.getPassword() = 123456; Read ONLY

        // obj.userName = "HI";

        obj.setUserName("Hello");

        System.out.println( obj.getPassWord() );



    }
}
