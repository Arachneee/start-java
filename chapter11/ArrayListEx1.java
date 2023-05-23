package chapter11;

import java.util.*;
public class ArrayListEx1 {
    public static void main(String[] args){
        ArrayList list1 = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        for(int i=list1.size()-1;i>=0;i--){
            System.out.print(i+": before"+list1);
            list1.remove(i);
            System.out.println("after"+list1);
        }

        ArrayList list2 = new ArrayList(10);
        list2.add('1');
        list2.add('a');
        list2.add("asbd");

        System.out.println(list2);
        if (list2.get(2).toString().charAt(0) == 'a'){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
