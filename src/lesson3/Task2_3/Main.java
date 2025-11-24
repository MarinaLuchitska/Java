package lesson3.Task2_3;

//Створити інтерфейс Instrument, реалізовуючі його класи “Гітара”, “Барабан”  та “Труба” .
//
//Інтерфейс Instrument  містить метод play().
//
//Клас “Гітара” містить змінну класу “кількість Струн”,
//
//клас “Барабан” – розмір, а клас “Труба” – діаметр.

public class Main {
    public static void main(String[] args) {

        Instrument[] instruments = {
                new Drum(14),
                new Guitar(6),
                new Trumpet(10)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
