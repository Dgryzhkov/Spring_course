package aop;

import org.springframework.stereotype.Component;

/**
 * @author Dgryzhkov
 */
@Component()
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void returnBook() {
        System.out.println("Возврващаем книгу в UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Возврващаем журнал в UniLibrary");
    }

    public void addBook() {
        System.out.println("Добавлем книгу в UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в UniLibrary");
    }

}
