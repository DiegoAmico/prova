package diego.manager;
import javax.persistence.Query;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.StaticFilterAliasGenerator;

import org.hibernate.mapping.PrimaryKey;

public class JpaMain {

	static EntityManagerFactory factory;
	static EntityManager entyManager;

	public static void main(String[] args) {

		Begin();
		
        // crea();
         //update();
		//find();
		query();

		end();
	}

	public static void Begin() {
		factory = Persistence.createEntityManagerFactory("Gruppo");

		entyManager = factory.createEntityManager();

		entyManager.getTransaction().begin();
	}

	// metodo che crea una nuova persona in tabella
	public static void crea() {
		
		Persone newPersona = new Persone();
		newPersona.setNome("Gianni");
		newPersona.setCognome("Bimballo");
		newPersona.setLuogo_di_nascita("Baddaro");
		newPersona.setData_di_nascita(java.sql.Date.valueOf("2000-09-04"));
		entyManager.persist(newPersona);
	}

	private static void find() {
		Integer primaryKey = 5;
		Persone cerca = entyManager.find(Persone.class, primaryKey);
		System.out.println(cerca.getData_di_nascita());

	}

	private static void update() {
		Persone existPersona = new Persone();
		existPersona.setId(11);
		existPersona.setNome("Gianni");
		existPersona.setCognome("Bimballo");
		existPersona.setLuogo_di_nascita("Baddaro");
		existPersona.setData_di_nascita(java.sql.Date.valueOf("2000-09-04"));
		entyManager.merge(existPersona);
	}
	
	private static void query() {
		
		String jpql=" select  servizio from Servizi";
		
		Query query=entyManager.createQuery(jpql);
		
		System.out.println(query.getResultList());
	}

	public static void end() {
		entyManager.getTransaction().commit();
		entyManager.close();
		factory.close();
	}

}
