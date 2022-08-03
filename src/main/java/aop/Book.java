package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Dgryzhkov
 */
@Component
public class Book {
    @Value("Преступление и наказание")
    private String name;
    @Value("Ф.М. Достоевский")
    private String author;
    @Value("1886")
    private int yearsOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearsOfPublication() {
        return yearsOfPublication;
    }
}
