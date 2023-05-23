package chapter11;

import java.util.*;
public class ArrayListEx1 {
    public static void main(String[] args){
        ArrayList list1 = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        for(int i=list1.size()-1;i>=0;i--){
            System.out.println(i);
            list1.remove(i);
            System.out.println(list1);
        }
    }
}
