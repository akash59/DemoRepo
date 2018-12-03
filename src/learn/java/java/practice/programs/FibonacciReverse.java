package learn.java.java.practice.programs;

public class FibonacciReverse {

    static void fibonacciReverse(int n) {

        try {

            long a[] = new long[n];

            a[0] = 0;
            a[1] = 1;

            for (int i = 2; i < n; i++) {
                a[i] = a[i-1] + a[i-2];
            }

            for (int i = a.length-1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }

        }

        catch (RuntimeException ae) {

            System.out.println("Exception Occurred : " +ae.getMessage());
        }
    }

    public static void main(String[] args) {

        FibonacciReverse.fibonacciReverse(50);

    }
}
