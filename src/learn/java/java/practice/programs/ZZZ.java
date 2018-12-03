package learn.java.java.practice.programs;

import java.util.ArrayList;
import java.util.List;

public class ZZZ {

    static int y = 10;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(30);
        list.add(9);

        list.removeIf(e -> e%2 != 0);
        System.out.println(list);

    }

}
