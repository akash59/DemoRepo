package learn.java.java.practice.programs;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Palindrome {


    public static void main(String[] args) {

        NumberFormat formatter = new DecimalFormat("#0.00000");
        long start =  System.currentTimeMillis();
        System.out.println("Start time "+ start);

        System.out.println(ifPalindrome("saippuakivikauppias"));
        System.out.println(ifPalindrome("steponnopets"));

        System.out.println("Is String 'steponnopets' Palindrome " +isPalindrome("steponnopets"));
        System.out.println("Reversed String using recusion is - " +reverseUsingRecursion("Sunidhi Sood"));

        long end =  System.currentTimeMillis();
        System.out.println("End time "+ end);
        long totaltime = end - start;

        System.out.println("Execution time is " + formatter.format(totaltime / 1000d) + " seconds");
    }

    static boolean ifPalindrome(String str) {

        char ch[] = str.toCharArray();
        int start = 0, end = ch.length - 1;
        while (start < end) {
            if (ch[start] != ch[end]) {
                return false;
            }
            ++start;
            --end;
        }

        return true;
    }

    static boolean isPalindrome(String str) {

        String reverse = "";
        for(int i = str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }

        if(str.equalsIgnoreCase(reverse)) {
            return true;
        } else {
            return false;
        }

    }

    static String reverseUsingRecursion(String str)
    {
        if(str != null && str.length() > 1) {
            return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
        } else {
            System.out.println("Please enter a valid string !!!");
            return str;
        }
    }

}
