package learn.java.java.practice.programs;

public class BubbleSortIntegerArray {


    public void sortBubble(int arr[]) {

        if(arr.length == 0 || arr.length == 1) {
            System.out.println("Please enter a valid integer array");
        }

        int temp;
        for(int i =0; i <= arr.length-1; i++) {

            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }


    public void testSort(int arr[]) {

        if(arr.length == 0 || arr.length == 1) {
            System.out.println("Please enter a valid integer array");
        }

        int temp;
        for(int i =0; i <= arr.length-1; i++) {

            for(int j = i+1; j <= arr.length-1; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String[] args) {
        BubbleSortIntegerArray bubblesort = new BubbleSortIntegerArray();

        int[] array = {159, 24, 87, 48, 100, 64, 34, 25, 12, 22, 11, 90};
        //bubblesort.sortBubble(array);
        bubblesort.testSort(array);
        System.out.println("Sorted Array : ");
        bubblesort.printArray(array);
    }
}




