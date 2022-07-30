package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dgryzhkov
 */
public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
//        Dog yourDog = context.getBean("dog", Dog.class);
//
//        System.out.println("Переменные ссыллаются а один и тот жe обьект, " + (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);

        context.close();
    }
}