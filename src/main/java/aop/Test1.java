package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dgryzhkov
 */
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Book book = context.getBean("book", Book.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook(book);


//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//
//        schoolLibrary.getBook();
//        uniLibrary.returnBook();
//        uniLibrary.getMagazine();
        context.close();
    }
}
