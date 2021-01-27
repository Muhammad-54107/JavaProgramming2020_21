package Day11_MultiBranchif;

public class DaysInMonth2 {

    public static void main(String[] args) {
        int month = 10; // 1 to 12

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        if(has28Days){
            System.out.println("28 days");

        }else if(has30Days){

            System.out.println("30 days");

        }else{

            System.out.println("31 days");

        }

        System.out.println("=====================================");

        int days2 = (has28Days)? 28 : (has30Days)? 30 : 31;

        System.out.println(days2);






    }
}
