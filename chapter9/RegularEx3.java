package chapter9;

import java.util.regex.*;
public class RegularEx3
{
    public static void main(String[] args){
        String source = "HG:011-1234-5678, HP:011-1111-1111, HOME:02-999-9999 ";
        String pattern = "((H.:)0\\d{1,2})-(\\d{3,4})-(\\d{4})";

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(source);

        int i=0;
        while(m.find()){
            System.out.println( ++i + ": " +m.group());
        }

    }
}
