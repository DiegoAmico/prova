package diego.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GruppoManager {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Gruppo");
		
	    EntityManager entyManager =factory.createEntityManager();
	    
	    entyManager.getTransaction().begin();
	    
	    JpaTest newPersona= new JpaTest();
	    newPersona.setNome("Lulu");
	    newPersona.setCognome("Bimba");
	    newPersona.setEmail("bimbacue@hotmail.it");
	    newPersona.setCf("345-758-7");
	    
	    entyManager.persist(newPersona);
	    
	    entyManager.getTransaction().commit();
	    entyManager.close();

	}

}
