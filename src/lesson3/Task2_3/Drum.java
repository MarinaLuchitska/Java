package lesson3.Task2_3;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Drum implements Instrument{
    private int size;

    public Drum(int size) {
        this.size = size;
    }
     public void play(){
        System.out.println("Грає барабан з розміром " + size ) ;

     }


}
