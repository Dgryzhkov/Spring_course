package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class,1);
//            emp.setDepartment("IT");

            session.createQuery("update Employee set salary=1000 " +
                    "where surname = 'Ryzhkov'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("done!");
        } finally {
            factory.close();
        }
    }
}
