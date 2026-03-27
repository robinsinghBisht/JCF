package jcf.collectionList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

    public static void main(int[] args) {
        List<Integer> arr =  Arrays.asList(1,12,23,22);
        Arrays.copyOf(args, args.length);
        int[] arrWithoutZero = Arrays.copyOf(args, args.length);
        String[] arr1 = new String[]{Arrays.toString(args)};


        int[][] arr11 = new int[][]{args};

        List<String> fruits = Arrays.asList(Arrays.toString(args));
        Map<String, Integer> frequency = new HashMap<>();

       List<Integer> evenNum =  arr.stream().filter(value -> value%2==0).collect(Collectors.toList());
       int longestFruit = 0;

       for (int i = 0;i<= fruits.size()-1; i++){
          frequency.put(fruits.get(i), frequency.getOrDefault(fruits.get(i), 0)+1);
          if(longestFruit < fruits.get(i).length()){
              longestFruit = fruits.get(i).length();
          }
       }
       System.out.println("frequency of each fruit: "+ frequency);
//        System.out.println("longestFruit length: "+ fruits.get(longestFruitIndex));
    }

}
