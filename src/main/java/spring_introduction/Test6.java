package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dgryzhkov
 */
public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        System.out.println(cat1==cat2);
//        cat.say();
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();


        Person person = context.getBean("personBean", Person.class);
        Person person2 = context.getBean("personBean", Person.class);
//        person.callYourPet();
        context.close();
    }
}
