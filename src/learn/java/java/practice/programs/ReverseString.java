package learn.java.java.practice.programs;

public class ReverseString {

    public static String reverseStr(String str) {
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {

        System.out.println("Original String is :: "+ "Chakdeindia");
        String reversedString = reverseStr("Chakdeindia");
        System.out.println("Reversed String is :: "+ reversedString);
    }

}
