package Office_Hours.Practice_01_06_2021;

public class ExceptionHandling_Throws {

    public static void main(String[] args)  throws InterruptedException, CloneNotSupportedException{

        System.out.println("Test1 started");

        // throw new StringIndexOutOfBoundsException("Invalid index is given");

        Thread.sleep(3000);

        System.out.println("Test1 Ended");

        System.out.println("Test2 started");

        test2();

        System.out.println("Test 2 Ended");

    }

    public static void test2() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("You cannotclone me");

    }

    public static void method() throws Exception{
        String[] arr = {};
        main(arr);
    }

    public static void method2()throws Exception{
        method();
    }



}
