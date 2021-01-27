package Day11_MultiBranchif;

public class NameOfMonth {

    public static void main(String[] args) {
        int number = 1; // 1 ~12
        String month = "";

        if(number == 1){
            month = "Jan";
        }else if(number == 2){
            month = "Feb";
        }else if(number == 3){
            month = "March";
        }else if(number == 4){
            month = "April";
        }else if(number == 5) {
            month = "May";
        }else if(number == 6) {
            month = "June";
        }else if(number == 7) {
            month = "July";
        }else if(number == 8) {
            month = "Aug";
        }else if(number == 9) {
            month = "Sep";
        }else if(number == 10) {
            month = "Oct";
        }else if(number == 11) {
            month = "Nov";
        }else{
            month = "Dec";
        }

        System.out.println(month);




    }


}







/*
 2. write getPassWord program that can print out the name of the month based on the number 1 ~ 12
        number = 1
        output:
            January

 */