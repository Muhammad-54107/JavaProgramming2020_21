package Day12_Nestedif;

public class NameOfMonth {

    public static void main(String[] args) {

        int n = 100;
        String month = "";

        if(n >= 1 && n <= 12){

            month = (n==1)?"Jan" :(n==2)?"Feb" :(n==3)?"Mar" :(n==4)?"Apr"
                    :(n==5) ? "May" :(n==6)?"Jun" :(n==7)?"Jul" :(n==8)?"Aug"
                    :(n==9)?"Sep" :(n==10)? "Oct" :(n==11)?"Nov" : "Dec";



        }else{
            month = "No such getPassWord Month";
        }
        System.out.println(month);



    }
}
