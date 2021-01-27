package Day09_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "John";
        String citizen = "USA";

       boolean eligible = citizen == "USA";

        System.out.println(name +" is eligible to vote for Donald Trump or Joe Biden?\n\t"+eligible);

        System.out.println("=============================================================");

        String name2 = "Aaron";
        boolean isUSCitizen = true; //

        boolean eligibleToVote = isUSCitizen == true;
        //                          false == true
        //                              false

        System.out.println(name2 +" is eligible to vote for Donald Trump or Joe Biden?\n\t"+eligibleToVote);
    }
}




/*
2. write getPassWord program that can check if the person is eligible to vote for Donald Trump or Joe Biden

        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true
 */
