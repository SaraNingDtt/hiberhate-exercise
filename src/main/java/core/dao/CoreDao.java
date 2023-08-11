package core.dao;

import java.util.List;

import org.hibernate.Session;

import core.util.HibernateUtil;


public interface CoreDao<P, I> {
	int insert(P entity);

	int deleteById(I id);

	int update(P entity);

	P selectById(I id);

	List<P> selectAll();
	
	default Session getSession() {
//		return HibernateUtil.getSessionFactory().getCurrentSession();
		return HibernateUtil.getSessionFactory().openSession();
	}
}
