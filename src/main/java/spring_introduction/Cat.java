package spring_introduction;

/**
 * @author Dgryzhkov
 */
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
