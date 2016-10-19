package com.vaadin.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtility {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Blog");

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

}
