package lesson3.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Printable> items = new ArrayList<>();

        items.add(new Book("Harry Potter"));
        items.add(new Magazine("National Geographic"));
        items.add(new Book("The Hobbit"));
        items.add(new Magazine("Forbes"));

        for (Printable p : items) {
            p.print();
        }
    }
}
