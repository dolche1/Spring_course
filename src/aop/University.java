package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Nick Dolaberidze", 5, 4.2);
        Student st2 = new Student("Michael Ivanov", 2, 8.3);
        Student st3 = new Student("Lena Tereshkina", 1, 3.7);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }


    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        //System.out.print(students.get(4));
        System.out.println("Information from method getSudent:");
        System.out.println(students);
        return students;
    }

}
