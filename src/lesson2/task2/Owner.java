package lesson2.task2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Owner {
    private String name;
    private  String licence;

    public Owner(String name, String licence) {
        this.name = name;
        this.licence = licence;
    }
}
