package learn.java.java.practice.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoopExample {

    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(10);
        arrlist.add(11);
        arrlist.add(12);
        arrlist.add(13);
        arrlist.add(14);
        arrlist.add(15);
        arrlist.add(16);
        arrlist.add(17);
        arrlist.add(18);
        arrlist.add(19);
        arrlist.add(20);

      /* For Loop for iterating ArrayList */
        System.out.print(" For Loop - ");
        int flag = 0;
        for (int counter = arrlist.size() -1 ; counter >= 0; counter--) {
            if (flag == 2) {
                flag = 0;
            }
            else {
                System.out.print(arrlist.get(counter) + " ");
                flag++;
            }
        }

        /* Advanced For Loop*/
        /*System.out.print("\n Advanced For Loop - ");
        for (Integer num : arrlist) {
            System.out.print(num + " ");
        }*/

        /* While Loop for iterating ArrayList*/
        /*int count = 0;
        System.out.print("\n While Loop - ");
        while (arrlist.size() > count) {
            System.out.print(arrlist.get(count) + " ");
            count++;
        }*/

        /*Looping Array List using Iterator*/
        /*System.out.print("\n Iterator - ");
        Iterator iter = arrlist.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }*/
    }
}
