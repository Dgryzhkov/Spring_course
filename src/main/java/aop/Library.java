package aop;

import org.springframework.stereotype.Component;

/**
 * @author Dgryzhkov
 */
@Component("libraryBean")
public class Library {
    public void getBook(){
        System.out.println("Мы берем книгу");
    }
}
