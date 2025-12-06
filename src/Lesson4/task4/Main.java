package Lesson4.task4;
//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//В зооклубі створити методи, та застосувати їх
//1) додати учасника в клуб;
//2) додати тваринку до учасника клубу.
//3) видалити тваринку з власника.
//4) видалити учасника клубу.
//5) видалити конкретну тваринку з усіх власників.
//6) вивести на екран зооклуб.
//Подумати, яким повинен бути Person, щоб була можливість додавати йому тваринку.
//Подумати, яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку
public class Main {
    public static void main(String[] args) {
        // створюємо сам клуб
                ZooClub zooClub = new ZooClub();

                // створюємо людей
                Person p1 = new Person("Олег", 20);
                Person p2 = new Person("Марина", 18);
                Person p3 = new Person("Іван", 25);

                // створюємо тваринок
                Pet dog   = new Pet("Dog", "Барсик", 3);
                Pet cat   = new Pet("Cat", "Мурка", 2);
                Pet parrot = new Pet("Parrot", "Кеша", 1);

                // додаємо людей в клуб
                zooClub.addPerson(p1);
                zooClub.addPerson(p2);
                zooClub.addPerson(p3);

                // додаємо тваринок людям
                zooClub.addPetToPerson(p1, dog);     // Олег → собака
                zooClub.addPetToPerson(p1, cat);     // Олег → кіт
                zooClub.addPetToPerson(p2, parrot);  // Марина → папуга

                System.out.println("=== Клуб після додавання учасників і тварин ===");
                zooClub.printClub();

                // 3) видалити тваринку з власника
                zooClub.removePetFromPerson(p1, dog);
                System.out.println("=== Після видалення собаки у Олега ===");
                zooClub.printClub();

                // 5) видалити конкретну тваринку з усіх власників
                zooClub.removePetFromAllOwners(cat);
                System.out.println("=== Після видалення всіх котів у клубі ===");
                zooClub.printClub();

                // 4) видалити учасника клубу
                zooClub.removePerson(p3);
                System.out.println("=== Після видалення Івана з клубу ===");
                zooClub.printClub();
            }
        }





