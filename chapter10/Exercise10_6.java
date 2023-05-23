package chapter10;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercise10_6 {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar now = Calendar.getInstance();
        Calendar birth = Calendar.getInstance();

        birth.set(1997,2,27);
        int diff = (int)((now.getTimeInMillis()-birth.getTimeInMillis())/(24*60*60*1000));



        System.out.println("birth day="+sdf.format(birth));
        System.out.println("today    ="+sdf.format(now));
        System.out.println(diff+" days");


    }
}
