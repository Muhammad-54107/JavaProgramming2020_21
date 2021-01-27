package Day09_IfStatement;

public class EligibleToVote2 {

    public static void main(String[] args) {
        String name = "Jimmy";
        Boolean isUSACitizen = false;
        int age = 25;
        boolean hasCriminalBackground = false;

        boolean isEligible = isUSACitizen == true && age >= 18 && hasCriminalBackground == false ;
            //                  false == true && 25 >= 18 && false == false
            //                     false && true && false
        //
        System.out.println(name+" is eligible to vote: "+isEligible);

        System.out.println("=====================================================");

        String name2 = "John";
        String c1 = "Canada";
        String c2 = "USA";

        boolean eligible = c1 == "Canada"   ||  c2 == "USA";
        //                  "China == "USA" || "Canada" == "USA"
        //                          false || false



        System.out.println(name2+" is eligible to vote: "+eligible);


    }
}
