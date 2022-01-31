package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test01 {

	private static EntityManager em;
	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		
		emf = Persistence.createEntityManagerFactory("HibernateEj01");
		em = emf.createEntityManager();
		
		em.close();
		emf.close();
		
		System.out.println("Final del programa");
		
	}
}
