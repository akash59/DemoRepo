package learn.java.java.practice.programs;

/**
 *  Find the count of 1's between the numbers 10 - 20
 */
public class Find1s {

    public static void main(String[] args) {

        int count = 0;

        for (int left = 10; left <= 20; left++) {

            int quotient = left;

            while ((quotient / 10) != 0 || (quotient % 10 != 0)) {

                int remainder = quotient % 10;
                quotient = quotient / 10;

                if (remainder == 1) {
                    count++;
                }
            }

        }

        System.out.println("Number of 1's between 10 and 20 (inclusive) is: " + count);
    }

}
