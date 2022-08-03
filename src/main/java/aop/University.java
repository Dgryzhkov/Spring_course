package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dgryzhkov
 */
@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Denis",1, 5.0);
        Student st2 = new Student("Ivan", 2, 4.0);
        Student st3 = new Student("Elena", 3,3.0);

        students.add(st1);
        students.add(st2);
        students.add(st3);

    }

    public List<Student> getStudents(){
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
