package lesson4.task1;
//Створити List Юзерів
//– відсортувати  за  віком (зростання, а потім окремо спадання –  за допомогою методу sort)
//– відсортувати його за кількістю знаків в імені  (зростання, а потім окремо спадання)

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        List<User> userList= new ArrayList<>();
        userList.add(new User(2, "nut"));
        userList.add(new User(5, "banan"));
        userList.add(new User(3, "pinaple"));
        userList.add(new User(8, "tomat"));
        userList.add(new User(1, "apple"));
        userList.add(new User(6, "grape"));

        userList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(userList);

        userList.sort((o2, o1) -> o1.getAge() - o2.getAge());
        System.out.println(userList);

        userList.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println(userList);

        userList.sort((o1, o2) -> o1.getName().length() - o2.getName().length());
        System.out.println(userList);
    }
}
