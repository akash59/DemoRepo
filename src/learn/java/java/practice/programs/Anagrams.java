package learn.java.java.practice.programs;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Comparison for Anagrams for strings - " +s1 + " and " +s2 +" :: " + isAnagram(s1, s2));
        System.out.println(isAnagramUsingSort("Keep", "Peek"));
        System.out.println(isAnagramUsingSort("Mother In Law", "Hitler Woman"));
    }


    public static boolean isAnagram(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }


    public static boolean isAnagramUsingSort(String s1, String s2) {

        boolean isAnagram = false;
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()) {
            return isAnagram;
        }

        char str1ToChar [] = s1.toCharArray();
        char str2ToChar [] = s2.toCharArray();

        Arrays.sort(str1ToChar);
        Arrays.sort(str2ToChar);

        isAnagram = Arrays.equals(str1ToChar, str2ToChar);
        return isAnagram;
    }


}
