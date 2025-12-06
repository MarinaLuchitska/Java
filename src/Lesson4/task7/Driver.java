package Lesson4.task7;

import lombok.Data;
import lombok.NoArgsConstructor;

//Власник автомобіля теж має бути обʼєкт, у якого є поля
//Імʼя, вік, стаж водіння.
@Data
@NoArgsConstructor

public class Driver {
    private String name;
    private int age;
    private int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
}
