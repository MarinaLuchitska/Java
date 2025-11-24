package lesson3.Task2_3;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Trumpet implements Instrument  {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public void play(){
        System.out.println("Грає труба з діаметром " + diameter);

    }

}
