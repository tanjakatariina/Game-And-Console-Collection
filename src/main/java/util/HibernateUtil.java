package util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate utility class for managing SessionFactory.
 * 
 * @author tanjakatariina
 */
public class HibernateUtil {

	private static SessionFactory factory;

	private HibernateUtil() {
	}

	public static SessionFactory createSessionFactory() {
		try {
			if (factory == null) {
				factory = new Configuration().configure().buildSessionFactory();
			}
		} catch (HibernateException he) {
			System.out.println(he.getMessage());
		}
		return factory;
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}
	
	public static void closeSessionFactory() {
		try {
			if (factory != null) {
				getSessionFactory().close();
				System.out.println("SessionFactory closed!");
			}
		} catch (HibernateException he) {
			System.out.println(he.getMessage());
		}
	}
}