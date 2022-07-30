package aop;

import org.springframework.stereotype.Component;

/**
 * @author Dgryzhkov
 */
@Component
public class SchoolLibrary  extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }
}
