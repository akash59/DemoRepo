package udemy.primitiveDataTypes;

public class ShortandInt {

    public static void main(String[] args) {

        byte myNewByte = 12;
        short myNewShort = 1000;
        int myNewInt = 220000000;
        long myNewLong = 50000L + 10L * (myNewByte + myNewShort + myNewInt);
        System.out.println(myNewLong);

    }
}