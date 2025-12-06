package Lesson4.task3;

//Створити клас, котрий відповідає наступній моделі
//{
//    id: 1,
//    name: ‘vasya’,
//    surname: ‘pupkin’,
//    email: ‘asd@asd.com’,
//    age: 31,
//    gender: ‘MALE’,
//    skills: [{title: ‘java’, exp: 10}, {title: ‘js’, exp: 10}, {title: ‘c++’, exp: 10}],
//    car: {model: ‘toyota’, year: 2021, power: 250}
//}

import lesson2.task3.Gender;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] titles = {"java", "js", "c++"};
        int[] exps = {10, 10, 10};
        HashSet<User> usersSet = new HashSet<>();
        usersSet.add(new User(1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                titles,
                exps,
                "toyota",
                2021,
                250));
        usersSet.add(new User(
                2,
                "masha",
                "ivanova",
                "masha@gmail.com",
                27,
                Gender.FEMALE,
                titles,
                exps,
                "honda",
                2019,
                180
        ));

        usersSet.add(new User(
                3,
                "petro",
                "melnyk",
                "petro@ukr.net",
                40,
                Gender.MALE,
                titles,
                exps,
                "bmw",
                2020,
                320
        ));

        usersSet.add(new User(
                4,
                "olena",
                "shevchenko",
                "olena@mail.com",
                22,
                Gender.FEMALE,
                titles,
                exps,
                "audi",
                2018,
                200
        ));
        usersSet.add(new User(
                5,
                "andrii",
                "koval",
                "andrii@gmail.com",
                35,
                Gender.MALE,
                titles,
                exps,
                "mercedes",
                2022,
                400
        ));

        usersSet.add(new User(
                6,
                "svitlana",
                "honchar",
                "sveta@meta.com",
                29,
                Gender.FEMALE,
                titles,
                exps,
                "ford",
                2017,
                150
        ));
        usersSet.add(new User(
                7,
                "roman",
                "tsyhan",
                "roman@ukr.net",
                28,
                Gender.MALE,
                titles,
                exps,
                "volvo",
                2016,
                190
        ));

        usersSet.add(new User(
                8,
                "ira",
                "dobrova",
                "ira@gmail.com",
                33,
                Gender.FEMALE,
                titles,
                exps,
                "lexus",
                2020,
                310
        ));

        usersSet.add(new User(
                9,
                "denys",
                "tkachenko",
                "denys@meta.com",
                26,
                Gender.MALE,
                titles,
                exps,
                "mazda",
                2018,
                175
        ));

        usersSet.add(new User(
                10,
                "karina",
                "bondar",
                "karina@mail.com",
                24,
                Gender.FEMALE,
                titles,
                exps,
                "subaru",
                2019,
                260
        ));
//Використати композицію/агрегацію та енуми в потрібному місці.
//Створити HashSet з 10 об’єктів, проітерувати її, видалити всіх чоловіків
//Створити TreeSet з 10 об’єктів, посортовану за кількістю скілів від меньшого до більшого

        System.out.println("ДО ВИДАЛЕННЯ");
        usersSet.forEach(System.out::println);


        usersSet.removeIf(user -> user.getGender() == Gender.MALE);


        System.out.println("ПІСЛЯ ВИДАЛЕННЯ");
        usersSet.forEach(System.out::println);
    }
}
