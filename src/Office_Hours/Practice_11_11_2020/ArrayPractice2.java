package Office_Hours.Practice_11_11_2020;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] word = {"Anna", "Level", "Lol", "Donald", "Biden", "Aamir", "Agalar", "Engin"};

        int count = 0 ;

        for(String each : word ) { // "Anna", "Level", "Lol", "Donald", "Biden", "Aamir", "Agalar", "Engin"
            char firstChar = each.toLowerCase().charAt(0); //A
            char lastChar = each.toLowerCase().charAt(each.length() - 1); // getPassWord

            if (firstChar == lastChar) {
                count++;
            }

        }



    }
}
