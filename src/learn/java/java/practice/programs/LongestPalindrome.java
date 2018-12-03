package learn.java.java.practice.programs;

public class LongestPalindrome {

    public static String longestPalindromeString(String str) {

        if(str == null) return null;

        String longest = str.substring(0,1);
        for(int i = 0; i< str.length()-1; i++) {

            //Odd cases line '121' or 'aba'
            String palindrome = intermediatePalindrome(str, i, i);
            if(palindrome.length() > longest.length()) {
                longest = palindrome;
            }

            //Even cases like '1221' or 'AMMA'
            palindrome = intermediatePalindrome(str, i, i+1);
            if(palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }

        return longest;
    }


    public static String intermediatePalindrome(String s, int left, int right) {

        if(left > right) {
            return null;
        }

        while (left >=0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
            left--;
            right++;
        }

        return s.substring(left+1, right);

    }


    public static void main(String[] args) {

        System.out.println(longestPalindromeString("1234"));
        System.out.println(longestPalindromeString("12321"));
        System.out.println(longestPalindromeString("9912321456"));
        System.out.println(longestPalindromeString("9912333321456"));
        System.out.println(longestPalindromeString("12145445499"));
        System.out.println(longestPalindromeString("1223213"));
        System.out.println(longestPalindromeString("abb"));


    }

}
