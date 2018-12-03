package learn.java.java.practice.programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCountinArray {

    public static void main(String args[]) {

        int[] arr = new int[]{5, 6, 7, 9, 1, 3, 1, 5, 7, 2};
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {

        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i])+1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> pair : hm.entrySet()) {
            System.out.println(pair.getKey() + "   " + pair.getValue());

        }
    }

}
