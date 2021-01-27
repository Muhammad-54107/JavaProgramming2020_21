package Day12_Nestedif;

public class EligibleToVote {

    public static void main(String[] args) {

        String citizen = "USA";
        int age = 40;

        if(citizen == "USA"){

            if (age >= 18){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You must be at least 18 years old");
            }

        }else{
            System.out.println("You must be us citizen in order to vote");
        }







    }
}
