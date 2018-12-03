package learn.java.java.practice.programs;

public class FindMissingNoInArray {

    public static void main(String[] args) {

        int a[] = new int[]{1, 2, 4, 6, 3, 7, 8};
        int miss = findMissing(a, a.length);
        System.out.println("Missing No. is = "+miss);
    }

    public static int findMissing(int arr[], int n) {

        int total;
        total = ((n+1)*(n+2))/2;
        System.out.println(total);
        for (int i = 0; i < n; i++) {
            total = total - arr[i];
        }

        return total;
    }

}
