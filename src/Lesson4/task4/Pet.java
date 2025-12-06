package Lesson4.task4;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class Pet {
    private String type;
    private String name;
    private int age;

    public Pet(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }


}

