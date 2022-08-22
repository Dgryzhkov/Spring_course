package hibernate_test2;//package hibernate_test;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Denis", "Ryzhkov",
//                    "IT", 500);
//
//            Detail detail = new Detail("Tomsk", "123456789",
//                    "denis@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("done!");

//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Oleg", "Ryzhkov",
//                    "Sales", 700);
//
//            Detail detail = new Detail("Moscow", "987654321",
//                    "olegka@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("done!");


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("done!");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
