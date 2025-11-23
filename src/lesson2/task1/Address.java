package lesson2.task1;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Adress {
    private String street;
    private String city;

    public Adress(String street, String city) {
        this.street = street;
        this.city = city;
    }


}
