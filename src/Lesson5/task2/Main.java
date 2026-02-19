package Lesson5.task2;
//-Створіть програму, яка записує в текстовий файл список студентів з їхнім ім’ям, віком та курсом навчання.
//Потім програма повинна прочитати цей файл і вивести інформацію про студентів на екран, відсортувавши їх за віком.

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Mark",29,"CSS"));
        studentArrayList.add(new Student("Ivan", 20, "Java"));
        studentArrayList.add(new Student("Nina",27,"Phyton"));

        Path sss = Paths.get(System.getProperty("user.home")+ File.separator +"qqq"+File.separator+"file.txt");

        StringBuilder sb= new StringBuilder();
        for (Student student: studentArrayList){
            sb.append(student.toString()).append("\n");

        }
        String msg = sb.toString();

        byte[] bytes = msg.getBytes(StandardCharsets.UTF_8);
        Files.write(sss,bytes, StandardOpenOption.APPEND);
        List<String>list = Files.readAllLines(sss);
        list.forEach(System.out::println);


    }
}
