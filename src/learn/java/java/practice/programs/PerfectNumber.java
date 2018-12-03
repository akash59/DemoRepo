package learn.java.java.practice.programs;

/*
*   Perfect number is a positive integer that is equal to the sum of its proper positive divisors,
*   that is, the sum of its positive divisors excluding the number itself. Following are the examples of perfect number.
*   6= 1+2+3
*   28= 1+2+4+7+14
*   496= 1+2+4+8+16+31+62+124+248
*/



public class PerfectNumber {

    public void perfectNum(int num) {

        if(num <= 0) {
            System.out.println("Please enter a valid number.");
        }
        int sum = 1;
        for(int i = 2; i <= num/2; i++) {
            if(num%i == 0) {
                sum += i;
            }
        }

        if(sum == num) {
            System.out.println("Number entered is perfect number");
        } else {
            System.out.println("Entered no. is not a perfect number");
        }
    }


    public static void main(String[] args) {

        PerfectNumber pf = new PerfectNumber();
        pf.perfectNum(6);
        pf.perfectNum(28);
        pf.perfectNum(496);


    }

}
