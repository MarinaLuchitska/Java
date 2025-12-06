package lesson4.task7;
//Створити клас автомобіля з полями:+
//Марка автомобіля, потужність двигуна, власник, ціна, рік випуску.+
//Власник автомобіля теж має бути обʼєкт, у якого є поля+
//Імʼя, вік, стаж водіння.+
//Створити не менше 7 та не більше 20 машинок.+
//Зробити половині автопарку ремонт мотора, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).+
//Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його
// на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//Все через stream API

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Driver d1 = new Driver("Ivan", 30, 10);
        Driver d2 = new Driver("Petro", 26, 3);
        Driver d3 = new Driver("Oleh", 22, 1);
        Driver d4 = new Driver("Maksym", 45, 20);
        Driver d5 = new Driver("Andriy", 28, 4);
        Driver d6 = new Driver("Roman", 35, 12);
        Driver d7 = new Driver("Stepan", 19, 2);

        Car c1 = new Car("BMW", 300, d1, 25000, 2018);
        Car c2 = new Car("Audi", 280, d2, 23000, 2017);
        Car c3 = new Car("Mercedes", 320, d3, 27000, 2019);
        Car c4 = new Car("Toyota", 180, d4, 15000, 2015);
        Car c5 = new Car("Honda", 170, d5, 14000, 2016);
        Car c6 = new Car("Ford", 200, d6, 16000, 2014);
        Car c7 = new Car("Volkswagen", 190, d7, 15500, 2013);

        List<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);

        cars = cars.stream()
                .map(car -> {
                    car.setPower((int)(car.getPower() * 1.1));
                    return car;
                })
                .collect(Collectors.toList());
        System.out.println("Після ремонту двигуна:");
        cars.forEach(System.out::println);

        cars.stream()
                .map(Car::getDriver)
                .filter(d -> d.getExperience() < 5 && d.getAge() > 25)
                .forEach(d -> d.setExperience(d.getExperience() + 1));

        System.out.println("Після курсів водіїв:");
        cars.forEach(System.out::println);

        int totalPrice = cars.stream()
                .mapToInt(Car::getPrice)
                .sum();
        System.out.println("Загальна вартість усіх авто: " + totalPrice);







    }
}

