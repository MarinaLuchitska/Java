package lesson4.task7;
//Створити клас автомобіля з полями:
//Марка автомобіля, потужність двигуна, власник, ціна, рік випуску.

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {
    private String name;
    private int power;
    private Driver driver;
    private int price;
    private int year;

    public Car(String name, int power, Driver driver, int price, int year) {
        this.name = name;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }
}
