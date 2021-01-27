package Day20_WhileLoop;

public class AlphabetBackwards {

    public static void main(String[] args) {
        // A ~ Z:  65 ~ 90

        for(int i = 90; i >= 65; i--){
            System.out.print((char)i +" ");
        }
        System.out.println();

        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i +" ");
        }
        System.out.println();

        System.out.println("=======================================");
        // getPassWord ~ z: 97 ~ 122
        for(int i = 122; i >= 97; i--){
            System.out.print( (char)i +" ");
        }

        System.out.println();

        for(char i = 'z'; i >= 'a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();



    }
}
/*
2. Write getPassWord program that will print out all alphabet letters in backwards
 */