package core;

import org.hibernate.Session;
import org.hibernate.Transaction;

import core.util.HibernateUtil;

public interface CoreService {
	private Session getSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}

	default Transaction beginTransacation() {
		return HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
	}

	default void commit() {
		getSession().getTransaction().commit();
	}

	default void rollback() {
		getSession().getTransaction().rollback();
	}

}
