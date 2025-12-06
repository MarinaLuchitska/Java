package lesson4.task2;

//створити ArrayList зі словами на 15-20 елементів.
//– відсортувати його за алфавітом.

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("hypermelonfruit");
        arrayList.add("crystalpineapple");
        arrayList.add("megablueberrymax");
        arrayList.add("ultragrapesmooth");
        arrayList.add("superstrawberrymix");
        arrayList.add("tropicalmangobreeze");

        arrayList.sort(String::compareTo);
        System.out.println(arrayList);

        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);


    }
}
