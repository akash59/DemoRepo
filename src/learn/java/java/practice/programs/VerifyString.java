package learn.java.java.practice.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyString {

    static String s1 = "s";
    static String s2 = "s";
    static String s3 = new String("s");
    static String s4 = new String("s");

    protected static final String regexForUsersPaginationCount = "Showing 1 to 10 of [0-9].* user";

    // Create a pattern to be searched
    static Pattern pattern = Pattern.compile(regexForUsersPaginationCount);



    public static void main(String[] args) {

        if(s1==s2) {
            System.out.println("s1==s2");
        }

        if(s1==s3) {
            System.out.println("s1==s3");
        }

        if (s3==s4) {
            System.out.println("s3==s4");
        }

        String PaginationShowingInfo_FirstListing = "Showing 1 to 10 of 510 user(s)";

        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher(PaginationShowingInfo_FirstListing);
        if(m.find()) {
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end()-1));
        }



    }



}
