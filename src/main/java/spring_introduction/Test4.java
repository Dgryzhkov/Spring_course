package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dgryzhkov
 */
public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        //       myDog.setName("Belka");
        Dog yourDor = context.getBean("myPet", Dog.class);
//        yourDor.setName("Strelka");
//
//        System.out.println("\n"+myDog.getName()+"\n");
//        System.out.println(yourDor.getName());

        System.out.println("Переменные ссылаются на один и тото же обьект " + (myDog==yourDor)+"\n");
        System.out.println(myDog);
        System.out.println(yourDor);

        context.close();
    }
}
