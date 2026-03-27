package jcf.lambda;

import java.util.*;


//Given `r` rats, `unit` food per rat, and array `arr` of food per house,
// find minimum houses  (sorted by most food first) needed to feed all rats.
// Return 0 if impossible.
//        Input: `r=3, unit=2, arr=[3,4,5]` →
//        Need 6 total,
//        house with 5 + house with 4 = 9 ≥ 6 → Output: `2`

public class RatCount {

    public static int minHouses(int r, int unit, int[] arr) {
        int totalNeeded = r * unit;
        Arrays.sort(arr);
        int current = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            current += arr[i];
            if (current >= totalNeeded)
                return arr.length - i;
        }
        return 0;
    }

    public static void main(String[] args) {
     int arr[] = {1, 7, 2, 4, 3, 2, 1};
     int r = 3;
     int unit = 2;
        System.out.println( minHouses(r, unit,arr));
    }
}
