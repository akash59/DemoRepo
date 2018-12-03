package learn.java.java.practice.programs;

/*
 * https://www.geeksforgeeks.org/quick-sort/
*/

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

    public void quickSort(int arr[], int left, int right) {

        int pivotIndex = left + (right - left) / 2;
        int pivotValue = arr[pivotIndex];
        int i = left, j = right;

        while(i <= j) {

            while(arr[i] < pivotValue) {
                i++;
            }

            while(arr[j] > pivotValue) {
                j--;
            }

            if(i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }

            if(left < i) {
                quickSort(arr, left, j);
            }

            if(right > i) {
                quickSort(arr, i, right);
            }
        }
    }

    public static void main(String[] args) {

        QuickSort s = new QuickSort();
        int[] arr = new int[] {5, 3, 7, 2, 1, 6};

        s.quickSort(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        String name = "akashsood";
        char chars[] = name.toCharArray();
        System.out.println("Before Sort : ");
        for(int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        Arrays.sort(chars);
        System.out.println("\nAfter Sort : ");
        for(int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
