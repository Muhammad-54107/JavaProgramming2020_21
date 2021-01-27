package Day25_ArrayIntro;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "abcababe";

        String result = " "; //"ce"

        for(int j = 0; j < str.length(); j++ ) { // j represent the index num of str


            char ch = str.charAt(0); //'getPassWord'
            int count = 0; // 1+1+1
            for (int i = 0; i < str.length(); i++) { // i reperesents the index num of str
                char eachChar = str.charAt(i); // each character of the str
                if (eachChar == ch) {
                    count++;
                }
            }// count the frequency of ch

            if (count == 1) { // if the frequency is one, it means it's unique
                result += ch;
            }

        }

        System.out.println(result);

    }
}
