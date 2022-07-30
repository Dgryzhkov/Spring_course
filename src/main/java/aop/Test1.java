package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dgryzhkov
 */
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);

        schoolLibrary.getBook();
        uniLibrary.returnBook();
        uniLibrary.getMagazine();
        context.close();
    }
}