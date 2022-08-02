package aop;

import org.springframework.stereotype.Component;

/**
 * @author Dgryzhkov
 */
@Component()
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void returnBook(){
        System.out.println("Возврващаем книгу из UniLibrary");
    }

    public void getMagazine( ){
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
