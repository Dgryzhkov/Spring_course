package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author Dgryzhkov
 */
public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);

        university.addStudents();
        List<Student> students = university.getStudents();
        System.out.println(students);

        context.close();
    }
}
