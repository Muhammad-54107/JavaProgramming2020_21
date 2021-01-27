package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class ArrayPractice3 {
// anagram task
    public static void main(String[] args) {

       String str1 = "abcdefg";
       String str2 = "GFEDCBA";

       String[] arr1 = str1.split("");
       String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort((arr2));

        System.out.println(Arrays.toString(arr1)  );
        System.out.println(  Arrays.toString(arr2)   );







    }
}
