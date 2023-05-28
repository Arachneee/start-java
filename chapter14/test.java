package chapter14;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //List<Integer> arr = Arrays.asList(1,2,3,4,5);

        arr.replaceAll(i->i*10);

        Stream<Integer> intStream = arr.stream();


        arr.add(6);


        intStream.parallel().forEach(System.out::println);

        boolean ok = arr instanceof ArrayList<Integer>;
        System.out.println(ok);

    }
}
