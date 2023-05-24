package chapter11;

import java.util.*;
class TreeMapEx1 {
    public static void main(String[] args){
        String[] data = {"A","K","A","K","D", "K", "A", "K", "K", "K","Z","D"};

        TreeMap map = new TreeMap();

        for(int i=0;i<data.length;i++){
            if(map.containsKey(data[i])){
                Integer value = (Integer)map.get(data[i]);
                map.put(data[i], value.intValue()+1);
            } else {
                map.put(data[i], 1);
            }
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int value = (int) entry.getValue();
            System.out.println(entry.getKey()+":"+entry.getValue()+' '+value);
        }
        Set set = map.entrySet();
        List list = new ArrayList(set);

        System.out.println(list);
    }


}
