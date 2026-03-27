package jcf.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//These problems reflect the exact style and difficulty reported in Accenture assessments. Arrays and strings dominate,  with HashMap-based frequency counting as a recurring pattern.
//
//**Problem 1: Find duplicate elements in an array**
//*(Confirmed asked in Accenture interview, April 2024)*
//
//Given an array, return all elements that appear more than once.
//Input: `[1, 3, 2, 4, 3, 2, 7]` → Output: `[2, 3]`
public class Duplicate {

    public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr) map.merge(num, 1, Integer::sum);
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            if (e.getValue() > 1) result.add(e.getKey());
        return result;
    }

    public static void main(String[] args) {
     int arr[] = {1, 3, 2, 4, 3, 2, 7};
        System.out.println( findDuplicates(arr));
    }
}
