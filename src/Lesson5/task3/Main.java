package Lesson5.task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//– Cтворіть текстовий файл з іменами учнів та ід, створити файл з назвами курсу, ід курсу, та ід учнів,
//які навчаються на цьому курсі. Зчитати обидва файли, об’єднати між собою об’єкти з цих файлів,
//вивести в консоль та записати в новий файл
public class Main {
    public static void main(String[] args) throws IOException {

        Path studentPath = Paths.get(System.getProperty("user.home")+ File.separator +"qqq" + File.separator +"student.txt");
        Path coursePath = Paths.get(System.getProperty("user.home")+ File.separator +"qqq" + File.separator +"course.txt");
        Path sss = Paths.get(System.getProperty("user.home")+ File.separator +"qqq" + File.separator +"file.txt");
        List<String> lineS = Files.readAllLines(studentPath);
        List<Student> studentList = new ArrayList<>();
        for (String lines: lineS){
            String[] parts = lines.split(";");
            int studentId = Integer.parseInt(parts[0]);
            String studentName = parts[1];
            studentList.add(new Student(studentName, studentId));
        }
        Map<Integer,Student> studentsById = new HashMap<>();
        for (Student s: studentList){
            studentsById.put(s.getId(),s);
        }
        List<String> lineC = Files.readAllLines(coursePath);
        List<Course> courseList = new ArrayList<>();
        for (String lines: lineC){
            String[] parts = lines.split(";");
            int courseId = Integer.parseInt(parts[0]);
            String courseName = parts[1];
            String[] studentIdStrings = parts[2].split(",");

            List<Student> studentsOnCourse = new ArrayList<>();

            for(String studentIdst : studentIdStrings ){
                int studentId = Integer.parseInt(studentIdst.trim());
                Student student = studentsById.get(studentId);

                if (student != null){
                    studentsOnCourse.add(student);
                }
            }
            courseList.add(new Course(courseId,courseName,studentsOnCourse));
        }
        List<String> outpuLines = new ArrayList<>();
        for (Course course : courseList){
            String line = course.toString();
            System.out.println(line);
            outpuLines.add(line);
        }
        Files.write(sss,outpuLines);

    }

}
