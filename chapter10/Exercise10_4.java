package chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.text.*;


public class Exercise10_4 {
    public static void main(String[] args){
        String pormat = "yyyy/MM/dd";

        SimpleDateFormat sdf = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");

        DateFormat df = new SimpleDateFormat(pormat);



        while(true){
            try{
                System.out.println("날짜를 "+ pormat +"의 형태로 입력해주세요. (입력예:2007/05/11)");
                System.out.print(">>");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Date input = df.parse(br.readLine());
                System.out.println(sdf.format(input));
                break;
            } catch(Exception e){
                continue;
            }



        }




    }
}
