package learn.java.java.practice.programs;

public class StringRotation {

    public boolean checkStringRotation_OtherWay(String s1,String s2){
        boolean rotation = false;
        if(s1.length() != s2.length()) {
            System.out.println("s2 is not rotated version of s1");
        } else {
            String s3 = s1 + s1;

            if (s3.contains(s2)) {
                System.out.println("s2 is a rotated version of s1");
                rotation = true;
            } else {
                System.out.println("s2 is not rotated version of s1");
            }
        }
        return rotation;

    }

    public static void main(String[] args) {
        StringRotation sr = new StringRotation();
        boolean result = sr.checkStringRotation_OtherWay("scoreeng", "engscore");
    }



}
