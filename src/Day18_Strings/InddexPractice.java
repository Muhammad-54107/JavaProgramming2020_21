package Day18_Strings;

public class InddexPractice {

    public static void main(String[] args) {

        String str = "Hello World, Today is good Day";
        //   index =  012345678910
        String word = str.substring(6);

        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));

    char first = str.charAt(8);

        System.out.println(first);

        System.out.println(word);



    }
}
