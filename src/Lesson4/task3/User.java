package Lesson4.task3;

import lesson2.task3.Car;
import lesson2.task3.Gender;
import lesson2.task3.Skill;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.ArrayList;


@Data
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills;
    private Car car;



    public User(int id, String name, String surname, String email, int age, Gender gender,
                String[] titles, int[] exps, String model, int year, int power) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = new Car(model,year,power);
        this.skills = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            this.skills.add(new Skill(titles[i], exps[i]));
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }

}
