package Day34_ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {

    public static void main(String[] args) {
        String str = "aabaacddddefffffghhhhhhi";

        ArrayList<Character> list = new ArrayList();

        for(char each : str.toCharArray() ) list.add(each); // getting each character from string and adding spaces

        System.out.println(list);

        for(Character each : list) {
            if( Collections.frequency(list, each) == 1 ){
                System.out.print(each+" ");
            }
        }



    }
}
