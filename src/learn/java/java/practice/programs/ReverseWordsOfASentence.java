package learn.java.java.practice.programs;

public class ReverseWordsOfASentence {

    public static void main(String[] args) {

        String input = "Welcome to geeksforgeeks";
        System.out.println("Input String is : "+input);
        System.out.println("Result after reversing words : "+reverseWordsOfASentence(input));

    }

    public static String reverseWordsOfASentence(String input) {

        String result = "";
        String words[] = input.split(" ");
        for (String s : words) {
            for(int i = s.length()-1; i >= 0; i--) {
                result = result + s.charAt(i);
            }

            result+= " ";

        }
        return result;

    }
}
