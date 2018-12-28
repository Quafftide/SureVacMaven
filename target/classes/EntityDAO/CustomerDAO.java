package EntityDAO;

/*import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;*/
import Entity.Customer;
import javax.persistence.*;

public class CustomerDAO {
	
	/*public static void main(String []arg) {	
		
	} */
	
	public void addCustomerComplaint(Customer c) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(c);
		
		t.commit();
		
		em.close();
		
		
		
		
		
	}
	

}
	