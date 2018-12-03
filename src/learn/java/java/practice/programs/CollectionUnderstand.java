package learn.java.java.practice.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionUnderstand {

    public static void main(String[] args) {

        Collection values = new ArrayList();
        values.add("1");
        values.add("2");
        values.add(5);
        values.add(10);

        for(Object v : values) {
            System.out.println(v);
        }


        List<Integer> values1 = new ArrayList();
        values1.add(5);
        values1.add(6);
        values1.add(7);
        values1.add(8);
        values1.add(1, 9);

        for(int v : values1) {
            System.out.println(v);
        }




    }

}
