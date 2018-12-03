package learn.java.java.practice.programs;

public class ReverseSentence {

    public static void main(String[] args) {
        System.out.println(reverseSentence("Jai Hind"));
    }

    public static String reverseSentence(String sentence) {

        String words[] = sentence.split(" ");
        System.out.println("No. of words in the given sentence are "+words.length);
        String finalString = "";
        for (int i = (words.length - 1); i >= 0; i--) {
            finalString = finalString + words[i];

            if (i != 0) {
                finalString += " ";
            }
        }

        return finalString;

    }

}
