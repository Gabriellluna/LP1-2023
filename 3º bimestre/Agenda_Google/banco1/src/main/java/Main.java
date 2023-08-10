import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel", "Luna", "glunamaia@gmail.com" );
        Pessoa p2 = new Pessoa("Adonias", "Gomes", "jgomes@gmail.com");
        Pessoa p3 = new Pessoa("Lucas", "Lwdj", "jjsdkey@gmail.com");
        Pessoa p4 = new Pessoa("Dentinho", "Guimarães", "LucGui@gmail.com");
        Pessoa p5 = new Pessoa("Clara", "Leihka",  "ccswuid@gmail.com");
        Pessoa p6 = new Pessoa("Babu", "araújo", "gabih@gmail.com");


        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);
        session.persist(p6);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p.toString()));

        for(Pessoa p: pessoas){
            System.out.println(p.toString());
        }
    }

}
