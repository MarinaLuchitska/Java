package lesson2.task1;

//– створити клас, який би описував подібні об’єкти, використовуючи композицію/агрегацію
//
//https://jsonplaceholder.typicode.com/users/1

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company(
                "Romaguera-Crona",
                "harness real-time e-markets"
        );

        Company company2 = new Company(
                "Deckow-Crist",
                "synergize scalable supply-chains"
        );


        User user1 = new User(
                1,
                "Leanne Graham",
                "Bret",
                "Kulas Light",
                "Gwenborough",
                company1
        );

        User user2 = new User(
                2,
                "Ervin Howell",
                "Antonette",
                "Victor Plains",
                "Wisokyburgh",
                company2
        );
    System.out.println(user1);
    }

}
