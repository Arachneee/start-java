package chapter14;

import java.util.*;
import java.util.stream.*;

public class Exercise14_1 {
    public static void main(String[] args){
        Stream<Integer> intStream = IntStream.range(1,6).boxed();
        intStream.flatMap(i->Stream.of(1,2,3,4,5,6).map(i2->new int[]{i, i2}))
                .filter(iarr->iarr[0]+iarr[1]==6)
                .forEach(arr->System.out.println(Arrays.toString(arr)));

        String[] strArr = {"aaa","bb","c","dddd"};
        Stream<String> strStream = Stream.of(strArr);

        //OptionalInt result = strStream.mapToInt(String::length).max();
        //System.out.println(result.getAsInt());
        strStream.sorted(Comparator.comparing(String::length).reversed()).mapToInt(String::length).limit(1).forEach(System.out::println);

        IntStream rotoStream = new Random().ints(1,46);

        rotoStream.distinct().limit(6).sorted().forEach(System.out::println);


    }
}
