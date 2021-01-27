package Day17_String;

public class String_length {

    public static void main(String[] args) {
        String s = "Pneumonoultramicriscopicsilicoyolcanoconiosis";
        String s2 = "word";

        System.out.println(s.length()); // 45
        System.out.println(s2.length()); // 4
        int len = s.length();

        System.out.println(len == s2.length()); // 45 == 4 -> false
        System.out.println();

    }
}
