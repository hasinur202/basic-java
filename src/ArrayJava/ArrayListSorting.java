package ArrayJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(-2);
        number.add(4);
        number.add(40);
        number.add(25);
        number.add(5);
        System.out.println("Before sorting: " + number);

        Collections.sort(number);
        System.out.println("After sorting in ascending order: " + number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Sorting in descending order: " + number);

    }

}
