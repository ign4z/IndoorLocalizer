package it.uni.pwm.indoorlocalizer.model;
// Generated 8-nov-2017 10.12.07 by Hibernate Tools 5.2.5.Final

import java.util.List;
import javax.naming.InitialContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import it.uni.pwm.indoorlocalizer.util.HibernateUtil;


public class ApHome implements ApDao {

	private static Logger log= LogManager.getLogger("");
	
	@Override
	public int create(Ap ap) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		int id=0;
		try {
			transaction = session.beginTransaction();
			id= (Integer) session.save(ap);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			log.error(e);
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return id;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Ap> retrive() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Ap> l = null;
		try {
		   l=(List<Ap>) session.createNativeQuery("Select * from Studente").addEntity(Ap.class).list();
		}catch (HibernateException e) {
			log.error(e);
		}finally {
			if(session!=null)
				session.close();
		}
		return l;
	}

	@Override
	public boolean update(Ap ap) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(ap);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result=false;
			log.error(e);
		} finally {
			if (session!=null) 
				session.close();
		}
		return result;
	}

	@Override
	public boolean delete(Ap ap) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result = true;
		try {
			transaction = session.beginTransaction();
			session.delete(ap);
			transaction.commit();
		}catch (HibernateException e) {
			 transaction.rollback();
			 result= false;
			 log.error(e);
		}finally {
			if (session!=null)
				session.close();
		}
		return result;
	}

	
	
	
	
	
	
	
	
/*
	public void persist(Ap transientInstance) {
		log.debug("persisting Ap instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Ap instance) {
		log.debug("attaching dirty Ap instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ap instance) {
		log.debug("attaching clean Ap instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Ap persistentInstance) {
		log.debug("deleting Ap instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ap merge(Ap detachedInstance) {
		log.debug("merging Ap instance");
		try {
			Ap result = (Ap) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ap findById(java.lang.String id) {
		log.debug("getting Ap instance with id: " + id);
		try {
			Ap instance = (Ap) sessionFactory.getCurrentSession().get("Ap", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ap instance) {
		log.debug("finding Ap instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("Ap").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
	*/
}
