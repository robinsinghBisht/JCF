package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion {


    public static void main(String[] args) {

        int array[] = {1, 223, 3, 2, 3, 10, 12, 100, 50};
        List<Integer> arrayList = List.of(1, 223, 3, 2, 3, 10, 12, 100, 50);
        //    	Filter even numbers from a list of integers.
        System.out.println(arrayList.stream().filter(a -> a % 2 == 0).collect(Collectors.toList()));

        //Count how many numbers are greater than 10
        System.out.println(" greater than 10 numbers are  " +  Arrays.stream(array).boxed().filter(a -> a > 10).count());
        //Print all elements using streams.
        arrayList.stream().forEach(System.out::println);
//        	Convert list of integers to their squares.
        System.out.println(arrayList.stream().map(m -> m*m).collect(Collectors.toList()));

        //.	Convert a list of strim ngs to uppercase.
        List<String> stringList = List.of("hello", "money", "switch", "onemonth", "Apple");
        System.out.println(stringList.stream().map(a -> a.toUpperCase()).collect(Collectors.toList()));
//        Find names starting with “A”.
        System.out.println( stringList.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList()));

    }

}
