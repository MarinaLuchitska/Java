package lesson2.task3;
//-Створити клас, що відповідає наступній моделі
//{
//    id: 1,
//
//    name: ‘vasya’,
//
//    surname: ‘pupkin’,
//
//    email: ‘asd@asd.com’,
//
//    age: 31,
//
//    gender: ‘MALE’,
//
//    skills: [{title: ‘java’, exp: 10}, {title: ‘js’, exp: 10}, {title: ‘c++’, exp: 10}],
//
//    car: {model: ‘toyota’, year: 2021, power: 250}
//
//}
//
//Використати композицію/агрегацію та енуми в потрібному місці.


public class Main {
    public static void main(String[] args) {

        String[] titles = {"java", "js", "c++"};
        int[] exps = {10, 10, 10};

        User user = new User(
                1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                titles,
                exps,
                "toyota",
                2021,
                250
        );

        System.out.println(user);
    }
}
