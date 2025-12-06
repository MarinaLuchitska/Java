package Lesson4.task6;
//– Створити масив з 20 числами.
//– за допомогою способу sorted відсортувати масив.
// — за допомогою filter отримати числа, кратні 3
// — за допомогою filter отримати числа, кратні 10
// — перебрати (проітерувати) масив за допомогою foreach()
// — перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Num> num = new ArrayList<>();
        num.add(new Num(37));
        num.add(new Num(12));
        num.add(new Num(89));
        num.add(new Num(5));
        num.add(new Num(44));
        num.add(new Num(63));
        num.add(new Num(21));
        num.add(new Num(90));
        num.add(new Num(7));
        num.add(new Num(56));
        num.add(new Num(18));
        num.add(new Num(72));
        num.add(new Num(49));
        num.add(new Num(3));
        num.add(new Num(81));
        num.add(new Num(14));
        num.add(new Num(99));
        num.add(new Num(27));
        num.add(new Num(60));
        num.add(new Num(33));

//        num.sort((Integer o1, Integer o2) ->o1 -o2);
//        System.out.println(num);

        Stream<Num> stream = num.stream();
        stream
                .sorted(Comparator.comparingInt(Num::getNum))
                .filter(n -> n.getNum() % 3 == 0)
                .filter(n -> n.getNum() % 10 == 0)
                .map(n -> new Num(n.getNum() * 3))
                .forEach(n -> System.out.println(n.getNum()));

    }
}
