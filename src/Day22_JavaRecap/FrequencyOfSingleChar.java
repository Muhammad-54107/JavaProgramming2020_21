package Day22_JavaRecap;

public class FrequencyOfSingleChar {

    public static void main(String[] args) {
        String str = "Today I learned Java Language";
        char ch = 'e';

        int count = 0;

        for(int i = 0; i <= str.length()-1; i++){
           char eachChar = str.charAt(i); // represent each character from the string
            if(ch == eachChar){
                count++;
            }
        }

        System.out.println("count = " + count);
        System.out.println("Number of words: "+ (count+1));






    }
}
