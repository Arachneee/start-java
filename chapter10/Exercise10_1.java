package chapter10;

import java.util.*;
import java.text.*;


public class Exercise10_1 {
    public static void main(String[] args){
        Calendar d = Calendar.getInstance();
        d.set(Calendar.YEAR,2010);

        for(int i=0;i<12;i++){
            d.set(Calendar.MONTH,i);
            d.set(Calendar.DATE,1);
            d.add(Calendar.DATE,7-d.get(Calendar.DAY_OF_WEEK)+1);
            d.add(Calendar.WEDNESDAY,1);
            System.out.println(toString(d));
        }
    }

    public static String toString(Calendar date){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 2번째 일요일입니다.");

        return sdf.format(date.getTime());
    }

}
