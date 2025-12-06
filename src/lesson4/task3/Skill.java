package lesson4.task3;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Skill {
    private String title;
    private int exp;

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }
}
