package learn.java.java.practice.programs;

public class SecondLargestInArray {

    public int findSecondLargestNumberInArray(int[] a){
        int temp;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length - 2];
    }

    public static void main(String[] args){
        SecondLargestInArray array = new SecondLargestInArray();
        int a[]={4,7,55,16,33,27};
        System.out.println("Second largest number in given array is " + array.findSecondLargestNumberInArray(a));
    }
}
