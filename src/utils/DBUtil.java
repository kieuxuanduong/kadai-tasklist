package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static final String PERSISTANCE_UNIT_NAME = "kadai-tasklist";
	private static EntityManagerFactory emf;
	public static EntityManager createEntityManager() {
		return _getEntityManagerFactory().createEntityManager();
	}
	private static EntityManagerFactory _getEntityManagerFactory() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		}
		return emf;
	}
}
