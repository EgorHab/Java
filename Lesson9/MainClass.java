package JavaCore.Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        studentsCoursesStream();


    }
    public static void studentsCoursesStream() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Егор", Arrays.asList(new Courses("Manual testing"), new Courses("Java"), new Courses("Html"), new Courses("Web security"))));
        students.add(new Student("Игорь", Arrays.asList(new Courses("Frontend developer"), new Courses("JavaScript"), new Courses("Html"), new Courses("Css"))));
        students.add(new Student("Иван", Arrays.asList(new Courses("Design Basics"), new Courses("Figma"), new Courses("Adobe"), new Courses("Css"), new Courses("Html"))));
        students.add(new Student("Сергей", Arrays.asList(new Courses("Backend developer"), new Courses("Python"), new Courses("HTTP"))));

        String two = students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList()).toString();
        Courses courses = new Courses("Html");
        String three = students.stream().filter(s -> s.getCourses().contains(courses)).collect(Collectors.toList()).toString();

        String one = students.stream().map(student -> student.getCourses()).flatMap(g ->g.stream()).collect(Collectors.toSet()).toString();








        System.out.println("2 " + two);

        System.out.println("---------------------");

        System.out.println("3 " + three);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("1 " + one);


    }

}
