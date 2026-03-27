package jcf.collectionList.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Solution {
    public int firstUniqChar(String s) {

        char arr[] = s.toCharArray();
        Map<String, Integer> value = new HashMap<>();

        for(int i = 0; i<arr.length;i++){
            value.put( String.valueOf(arr[i]), value.getOrDefault(arr[i], 0)+1);
        }

        Optional<String> key = value.entrySet().stream().filter(a ->
                (a.getValue() == 1)
       ).
        map(Map.Entry::getKey).findFirst();

        return s.indexOf(key.get());
    }
}
