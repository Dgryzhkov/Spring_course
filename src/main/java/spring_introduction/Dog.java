package spring_introduction;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Dgryzhkov
 */
@Component
public class Dog implements Pet {
    //private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class dog: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class dog: destroy method");
    }
}
