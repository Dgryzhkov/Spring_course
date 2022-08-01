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

    public String getName() {
        return name;
    }
}
