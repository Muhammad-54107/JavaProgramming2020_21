package Day23_NestedLoop;

public class FrequencyOfWord2 {
    // without case sensitivity

    public static void main(String[] args) {
        String sentence = "Java java java java";
        String word = "java";
            word = word.toLowerCase();

        String temp = sentence.toLowerCase(); //"java java java"
        int count = 0;

        while(temp.contains(word.toLowerCase())){
            temp = temp.replaceFirst(word, "");
            count++;
        }

        System.out.println(count);







    }
}
