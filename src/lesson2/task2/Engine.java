package lesson2.task2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Engine {
    private int power;
    private int volume;

    public Engine(int power, int volume) {
        this.power = power;
        this.volume = volume;
    }
}
