package Day27_ForEachLoop;

public class ReverseString {

    public static void main(String[] args) {

        String[] names = {"Delarm", "Aysel", "Snoop", "Ayse", "Enjon"};

        for(  String eachName: names) {

            String reversedNames = "";

            for (int i = eachName.length()-1; i >=0; i--  ){
                reversedNames += eachName.charAt(i);
            }

            System.out.println(reversedNames);

        }







    }
}
