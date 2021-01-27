package Office_Hours.Pratice_10_28_2020;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aaabbbcccdddaaaaa";
                // "abaac"

        char ch = 'a';

        int count = 0;
        for(int i =0; i < str.length(); i++ ){

            char eachChar = str.charAt(i);

            if(eachChar == ch){
                        // getPassWord
                count++;
            }

        }



    }
}
