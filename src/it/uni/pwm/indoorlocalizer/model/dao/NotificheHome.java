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
import it.uni.pwm.indoorlocalizer.model.pojo.Notifiche;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.HibernateUtil;

/**
 * Home object for domain model class Notifiche.
 * @see .Notifiche
 * @author Hibernate Tools
 */
public class NotificheHome implements NotificheDao{
	
private static Logger log= LogManager.getLogger();
	
	@Override
	public int create(Notifiche n) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		int id=0;
		try {
			transaction = session.beginTransaction();
			id= (Integer) session.save(n);
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
	public List<Notifiche> retrive() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Notifiche> l = null;
		try {
		   l=(List<Notifiche>) session.createNativeQuery("Select * from notifiche").addEntity(Utente.class).list();
		}catch (HibernateException e) {
			log.error(e);
		}finally {
			if(session!=null)
				session.close();
		}
		return l;
	}

	@Override
	public boolean update(Notifiche n) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(n);
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
	public boolean delete(Notifiche n) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result = true;
		try {
			transaction = session.beginTransaction();
			session.delete(n);
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
	private static final Log log = LogFactory.getLog(NotificheHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Notifiche transientInstance) {
		log.debug("persisting Notifiche instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Notifiche instance) {
		log.debug("attaching dirty Notifiche instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Notifiche instance) {
		log.debug("attaching clean Notifiche instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Notifiche persistentInstance) {
		log.debug("deleting Notifiche instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Notifiche merge(Notifiche detachedInstance) {
		log.debug("merging Notifiche instance");
		try {
			Notifiche result = (Notifiche) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Notifiche findById(java.lang.Integer id) {
		log.debug("getting Notifiche instance with id: " + id);
		try {
			Notifiche instance = (Notifiche) sessionFactory.getCurrentSession().get("Notifiche", id);
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

	public List findByExample(Notifiche instance) {
		log.debug("finding Notifiche instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("Notifiche").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}*/
}
