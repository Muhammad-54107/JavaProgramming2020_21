package Day23_NestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {

        for(int j = 1; j <= 8; j++){ // j: 1, 2, 3, 4, 5, 6, 7, 8
            System.out.println("\t\t\t\t\t");
            for(int i = 1; i <= j; i++){ // j: 1, 2, 3, 4, 5, 6, 7, 8
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("===================================");

        for(int j = 1; j <= 5; j++){

            for(int i = 1; i <= 10; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("=======================================");





    }

}


