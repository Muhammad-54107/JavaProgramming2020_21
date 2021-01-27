package Day11_MultiBranchif;

public class GradeReport {

    public static void main(String[] args) {
        int score = 90; // 0 - 100

        boolean fail = score < 60;

        if (score < 60){
            System.out.println("Failed");
        }else if( score >= 60 && score < 90){
            System.out.println("Passed");

        }else { // score >=90
            System.out.println("Passed with distiction");
        }













    }
}
