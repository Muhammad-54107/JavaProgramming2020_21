package Office_Hours.Practice_01_27_2021;

import Day45_Exceptions.PhoneTask.Iphone;
import Day45_Exceptions.PhoneTask.Phone;

public class UpDownCastings {

    public static void main(String[] args) {
        //referance type castings

        Phone phone = new Iphone("12 Pro", 1100); //upcasting

        Iphone iphone = (Iphone) phone; // down casting

        // Phone phone2 = (Samsung) phone ;

    }


}
