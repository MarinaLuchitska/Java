package lesson2.task2;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

public class Car {
    private String model;
    private int year;
    private Engine engine;
    private Owner owner;

    public Car(String model, int year, int power,int volume, Owner owner) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(power, volume);
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", owner=" + owner +
                '}';
    }
}
