package lesson3.Task2_3;
//Клас “Гітара” містить змінну класу “кількість Струн”,

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Guitar implements Instrument {
    private int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    public void play(){
        System.out.println("Грає гітара з "+strings + " струнами");


    }
}
