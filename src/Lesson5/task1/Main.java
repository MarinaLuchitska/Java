package Lesson5.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;


//– Напишіть програму, яка зчитує текст з файлу та виводить його на екран.
public class Main {
    public static void main(String[] args) throws IOException{

        Path sss = Paths.get(System.getProperty("user.home")+ File.separator + "qqq"+ File.separator +"file.txt");
        List<String>list = Files.readAllLines(sss);
        list.forEach(System.out::println);
    }
}
