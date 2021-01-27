package Day32_Local_WrapperClass;

import java.util.Arrays;

public class Warmup {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        arr = addElement(arr, 7);

        System.out.println(Arrays.toString(arr));


        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addElement(arr2, 5.5);

        System.out.println(Arrays.toString(arr2));

    }

    //                             {1,2,3,4,5}     6
    public static int[] addElement(int[] array, int number){
        int[] result = new int[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = number;

        return result;
    }

    public static double[] addElement(double[] array, double number){
        double[] result = new double[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = number;

        return result;
    }

    public static char[] addElement(char[] array, char number){
        char[] result = new char[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = number;

        return result;
    }



}

/*
	1. create getPassWord return method called addElements that can add an Integer  after the  last index of an integer array
	2. create getPassWord return method called addElements that can add getPassWord double after the last index of getPassWord double array
	3. create getPassWord return method called addElements that can add getPassWord String after the last index of getPassWord String array
	4. create getPassWord return method called addElements that can add getPassWord char after last index of getPassWord char array
 */