import entity.Endereco;
import entity.Pedido;
import entity.Pessoa;
import entity.Produto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.hibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Pessoa p1 = new Pessoa("Calleri", "Goleador", "patinho@gmail", new Endereco("Cavaralha do Auçuga", "São Paulo Futebol Clube"));
        Pessoa p2 = new Pessoa("Valkiria", "Milhomem", "maedorafinha@hotmail", new Endereco("Tirapiçuga do Tissunuga", "Corinthians Chorador"));
        Pessoa p3 = new Pessoa("Tiabete", "Calvo", "cabeludo2005@gmail", new Endereco("Elineas Florindo Junior Cavaralha", "Salvador"));
        Pessoa p4 = new Pessoa("Gustavinho", "Gameplays", "minecraft2013@gmail", new Endereco("Bom Jesus da Penha", "ljwnxoewcp"));

        Produto produto = new Produto("Traquinas", 1.50f);


        Session session = hibernateUtil.getSessionFactory().openSession();

        Pedido pedido = new Pedido(p1, Arrays.asList(produto));

        Transaction transaction = session.beginTransaction();

        session.persist(pedido);

        transaction.commit();

        List<Pedido> pedidos= session.createQuery("from Pedido", Pedido.class).list();

        pedidos.forEach(p -> System.out.println(p));


        Endereco e1 = new Endereco("Cavaralha do Auçuga", "São Paulo Futebol Clube");
        Endereco e2 = new Endereco("Tirapiçuga do Tissunuga", "Corinthians Chorador");
        Endereco e3 = new Endereco("Elineas Florindo Junior Cavaralha", "Salvador");
        Endereco e4 = new Endereco("Bom Jesus da Penha", "ljwnxoewcp");

        Session session2 = hibernateUtil.getSessionFactory().openSession();

        Transaction transaction1 = session.beginTransaction();

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        session.persist(e4);

        transaction.commit();

        List<Endereco> endereco = session.createQuery("from Endereco", Endereco.class).list();
        endereco.forEach(p -> System.out.println(p));
        session.createQuery("from Endereco", Endereco.class).list().forEach(p -> System.out.println(p));


        //List<Endereco> endereco = session.createQuery("from Endereco(nome da entidade)", Endereco.class).list();//


        //Pedido pedido1 = new Pedido(new Pessoa("Gabrioel", "Luna", "glunamaia@gmail.com", new Endereco("Tabor", "São Paulo"), new Produto("Carrimho de brinquedo", 57.00 )));
        //Pedido pedido2 = new Pedido(new Pessoa("Gustavo", "Emiliano", "gustavoemiliano2014@gmail.com"), new Endereco("Rua Odorico Mendes", "São Paulo"), new Produto("Bola de futebol", 159.90));
    }
}
