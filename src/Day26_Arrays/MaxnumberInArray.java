package Day26_Arrays;

public class MaxnumberInArray {

    public static void main(String[] args) {

        int[] numbers = {300, 100, 400, 50, 500, 150, 170};
        //               0      1    2   3   4

        int max = numbers[0]; //300

        for(int i =0; i <= numbers.length-1; i++){
            if(numbers[i] > max){
               max = numbers[i];
           }
        }

        System.out.println("max = "+max);




    }
}
