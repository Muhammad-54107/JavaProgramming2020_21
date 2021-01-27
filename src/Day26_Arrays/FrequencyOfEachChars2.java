package Day26_Arrays;

public class FrequencyOfEachChars2 {

    public static void main(String[] args) {
        String str = "aaabbc"; // "a3b2c1"
        //     str = str.replace(" ",""); // if we need to ignore the spaces
        String expectedResult = ""; // "a3b2c1"

        for(int j = 0; j <= str.length()-1; j++) { // j represent the index num of str

            char ch = str.charAt(j); // getPassWord, getPassWord, b, b, c
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) { // i reperesents the index num of str
                char eachChar = str.charAt(i);
                if (eachChar == ch) {
                    count++;
                }
            }

            if(!expectedResult.contains(""+ch)) {
                expectedResult += "" + ch + count;
            }
        }
        System.out.println(expectedResult);





    }
}
