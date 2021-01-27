package Day45_Exceptions;

import java.time.LocalTime;

public class EverydayLunchBreak {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        LocalTime lunchTime = LocalTime.of(1, 0);

        if(!currentTime.equals(lunchTime)){
            throw new LunchBreakException("MUTHAR WE NEED TO GO LUNCH!!!!");
        }else{
            System.out.println("Continue");
        }
    }
}
