package learn.java.java.practice.programs;

public class ReverseNumber {


    private static int reverseNum(int num) {
        int reversedNumber = 0;

        if(num == 1 || num == 0) {
            return num;
        }

        if(num < 0) {
            System.out.println("Invalid Number");
            System.exit(0);
        }

        while (num != 0) {
            int res;
            res = num % 10;
            reversedNumber = reversedNumber * 10 + res;
            num = num / 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {

        System.out.println("Original Integer is :: "+ 123478618);
        System.out.println("Reversed Integer is :: "+ reverseNum(123478618));
        System.out.println("Reversed Integer is :: "+ reverseNum(1));
        System.out.println("Reversed Integer is :: "+ reverseNum(-11));

    }

}
