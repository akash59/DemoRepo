package learn.java.java.practice.programs;

//Find the first repeating and non-repeating element in an array of integers/ in a string

import java.util.*;

public class FirstRepeatingElementInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 7, 6, 3, 2, 4, 5, 7, 2};
        findRepeatingElement(arr);
        firstRepeatedNonRepeatedChar("2376324572");

    }

    private static void findRepeatingElement(int[] arr) {

        Set<Integer> hset = new HashSet<>();
        int min = -1;
        for (int i = arr.length-1; i >=0; i--) {
            if (hset.contains(arr[i])) {
                min = i;
            } else {
                hset.add(arr[i]);
            }
        }

        if (min != -1) {
            System.out.println("First Repeating Element in the Array is : " + arr[min]);
        } else {
            System.out.println("There are no repeating elements");
        }
    }

    static void firstRepeatedNonRepeatedChar(String inputString)
    {
        //Creating a HashMap containing char as a key and occurrences as a value
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        //Converting inputString to char array
        char[] strArray = inputString.toCharArray();

        //Checking each char of strArray
        for (char c : strArray) {
            if(charCountMap.containsKey(c)) {
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else {
                //If char is not present in charCountMap,
                //adding this char in charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }

        //checking for first non-repeated character
        for (char c : strArray) {
            if (charCountMap.get(c) == 1) {
                System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
                break;
            }
        }

        //checking for first repeated character
        for (char c : strArray) {
            if (charCountMap.get(c) > 1) {
                System.out.println("First Repeated Character In '"+inputString+"' is '"+c+"'");
                break;
            }
        }
    }
}