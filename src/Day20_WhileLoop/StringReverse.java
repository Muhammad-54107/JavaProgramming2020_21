package Day20_WhileLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "ABCD";
        //           =0123456789

        String result = "";    // we want to contain the expected result which isthe revered version  of str
        // DCBA



        for(int i = str.length()-1; i >=0; i--){ // i :3, 2, 1, 0, -1
            result += str.charAt(i); // D  C B A
        }

        System.out.println("result =  "+ result);









    }
}
