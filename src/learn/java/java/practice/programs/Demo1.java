package learn.java.java.practice.programs;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author Akash Sood
 */
public class Demo1 {

    static Boolean b1[] = new Boolean[5];

    public static void main(String[] args) {
        System.out.println(b1[0]);


        boolean bool = true;

        if (bool==false) {

            System.out.println("a");


        } else if (bool)
        {
            System.out.println("b");
        }

        else if (!bool)
        {
            System.out.println("c");
        }

        else{
            System.out.println("d");
        }
    }



}
