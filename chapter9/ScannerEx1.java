package chapter9;

import java.util.*;
public class ScannerEx1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while(true){
            String prompt = ">>";
            System.out.print(prompt);

            String input = s.nextLine();

            input = input.trim();
            argArr = input.split(" \\+");
            for(String i:argArr){
                System.out.println(i);
            }

            String command = argArr[0].trim();
            if(command.equals("q")){
                System.exit(0);
            }

        }
    }
}
