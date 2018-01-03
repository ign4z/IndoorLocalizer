package it.uni.pwm.indoorlocalizer.model.dao;
// default package
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
import it.uni.pwm.indoorlocalizer.model.pojo.Campus;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.HibernateUtil;

/**
 * Home object for domain model class Campus.
 * @see .Campus
 * @author Hibernate Tools
 */
public class CampusHome implements CampusDao {

private static Logger log= LogManager.getLogger("");
	
	@Override
	public int create(Campus c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		int id=0;
		try {
			transaction = session.beginTransaction();
			id= (Integer) session.save(c);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			log.error(e);
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return id;	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Campus> retrive() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Campus> l = null;
		try {
		   l=(List<Campus>) session.createNativeQuery("Select * from Campus").addEntity(Campus.class).list();
		}catch (HibernateException e) {
			log.error(e);
		}finally {
			if(session!=null)
				session.close();
		}
		return l;
	}

	@Override
	public boolean update(Campus c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(c);
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
	public boolean delete(Campus c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result = true;
		try {
			transaction = session.beginTransaction();
			session.delete(c);
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

	/*private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Campus transientInstance) {
		log.debug("persisting Campus instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Campus instance) {
		log.debug("attaching dirty Campus instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Campus instance) {
		log.debug("attaching clean Campus instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Campus persistentInstance) {
		log.debug("deleting Campus instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Campus merge(Campus detachedInstance) {
		log.debug("merging Campus instance");
		try {
			Campus result = (Campus) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Campus findById(java.lang.Integer id) {
		log.debug("getting Campus instance with id: " + id);
		try {
			Campus instance = (Campus) sessionFactory.getCurrentSession().get("Campus", id);
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

	public List findByExample(Campus instance) {
		log.debug("finding Campus instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("Campus").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
	*/
}
