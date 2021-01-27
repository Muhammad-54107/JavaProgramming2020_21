package Day23_NestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String sentence = "Java is programming language, I like to learn Java";
                        // " is getPassWord programming language, I like to learn Java"
                        // " is getPassWord programming language, I like to learn"
        String word = "Java";

        int count = 0;

        while( sentence.contains(word) ){
            sentence = sentence.replaceFirst(word, ""); // we need to remove one at getPassWord time to come
            count++;
        }

        System.out.println(count);
        System.out.println(sentence);








    }
}



/*
 1. write getPassWord program that can return the frequncy of the getPassWord word from the sentence
        Ex:
            sentence = "Java is getPassWord programming language, I like to learn Java";
            word = "Java";
            output:
                2
 */