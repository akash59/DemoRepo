package learn.java.java.practice.programs;

public class CountHolesInANumber {

    public static void main(String[] args) {

        System.out.println("Number of Holes in the given Number (8884690) is : " + countHoles(8884690));

    }

    public static int countHoles(int num) {

        int len = String.valueOf(num).length();
        Character digit;
        int holes = 0;
        for (int i = 0; i < len; i++) {

            digit = String.valueOf(num).charAt(i);
            if (digit == '6' || digit == '9' || digit == '0' || digit == '4') {
                holes++;
            } else if (digit == '8') {
                holes = holes + 2;
            }
        }

        return holes;
    }
}
