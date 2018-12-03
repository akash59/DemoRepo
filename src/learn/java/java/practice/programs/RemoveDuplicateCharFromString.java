package learn.java.java.practice.programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharFromString {

    public static void main(String args[]) {

        String inputString = "freedomdaysale";
        System.out.println("String after removing duplicates : "+ removeDuplicate(inputString));

        String s = "geeksforgeeks";
        System.out.println(removeDuplicatesUsingIndexOf(s));
    }

    /*
     * A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.
     * When the iteration order is needed to be maintained this class is used. When iterating through a HashSet the order
      * is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted.
      * When cycling through LinkedHashSet using an iterator, the elements will be returned in the order in which they were inserted.
     */

    static String removeDuplicate(String inputStr) {

        String newString = "";

        if(inputStr ==null && inputStr.length() <= 1) {
            System.out.println("Please enter a valid string");
            return inputStr;
        }

        char strToCharArray[] = inputStr.toCharArray();

        LinkedHashSet<Character> hset = new LinkedHashSet<>();
        for (int i = 0; i<=strToCharArray.length-1; i++) {
            hset.add(strToCharArray[i]);
        }

        for(Character ch : hset) {
            newString += ch;
        }

        return newString;

    }

    /*
     * Method 5 (Using IndexOf() method in Java) :
    */
    static String removeDuplicatesUsingIndexOf(String input) {

        char charArray[] = input.toCharArray();
        String output = "";

        for(int i = 0; i<=charArray.length-1; i++) {
            if(output.indexOf(charArray[i]) < 0) {
                output += charArray[i];
            }
        }

        return output;

    }




}
