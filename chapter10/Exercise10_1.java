package chapter10;

import java.util.*;
import java.text.*;


public class Exercise10_1 {
    public static void main(String[] args){
        Calendar d = Calendar.getInstance();
        d.set(Calendar.YEAR,2010);
        d.set(Calendar.MONTH,0);
        d.set(Calendar.DATE,1);

        System.out.println(6-d.get(Calendar.DAY_OF_WEEK));

        System.out.println(toString(d));
    }

    public static String toString(Calendar date){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.format(date.getTime());
    }

}
