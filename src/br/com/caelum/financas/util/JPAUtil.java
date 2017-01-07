package br.com.caelum.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("financas-mysql");

	public EntityManager getEntityManager() {
		return managerFactory.createEntityManager();
	}
}
