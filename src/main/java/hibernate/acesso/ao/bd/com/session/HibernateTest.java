package hibernate.acesso.ao.bd.com.session;

import java.util.List;

import org.hibernate.*;

public class HibernateTest {
 
public static void main(String[] args) {
          
        Session session = HibernateUtil.getSessionFactory().openSession();
  
        session.beginTransaction();
 
        Departamento department = new Departamento("java");
        session.save(department);
 
        session.save(new Empregado("Jakab Gipsz",department));
        session.save(new Empregado("Captain Nemo",department));
      
        session.getTransaction().commit();
 
        Query q = session.createQuery("From Empregado ");
                 
        List<Empregado> resultList = q.list();
        System.out.println("numero de empregados:" + resultList.size());
        for (Empregado next : resultList) {
            System.out.println("proximo empregado: " + next);
        }
 
    }
    
}