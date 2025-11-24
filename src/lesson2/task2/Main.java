package lesson2.task2;

 public class Main {
        public static void main(String[] args) {

            Owner owner1 = new Owner("Alex", "AB123456");
            Owner owner2 = new Owner("Maria", "XY987654");

            Car car1 = new Car(
                    "Toyota Corolla",
                    2015,
                    150,
                    2000,
                    owner1
            );

            Car car2 = new Car(
                    "BMW 330i",
                    2020,
                    250,
                    3000,
                    owner2
            );

            System.out.println(car1);System.out.println(car2);
        }
    }
