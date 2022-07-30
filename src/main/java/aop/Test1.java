package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dgryzhkov
 */
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("libraryBean", Library.class);

        library.getBook();

        context.close();
    }
}
