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
import it.uni.pwm.indoorlocalizer.model.pojo.Edificio;
import it.uni.pwm.indoorlocalizer.model.pojo.EdificioId;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.HibernateUtil;

/**
 * Home object for domain model class Edificio.
 * @see .Edificio
 * @author Hibernate Tools
 */
public class EdificioHome implements EdificioDao {
	

private static Logger log= LogManager.getLogger();
	
	@Override
	public int create(Edificio e) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		int id=0;
		try {
			transaction = session.beginTransaction();
			id= (Integer) session.save(e);
			transaction.commit();
		} catch (HibernateException ex) {
			transaction.rollback();
			log.error(ex);
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return id;	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Edificio> retrive() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Edificio> l = null;
		try {
		   l=(List<Edificio>) session.createNativeQuery("Select * from Edificio").addEntity(Edificio.class).list();
		}catch (HibernateException e) {
			log.error(e);
		}finally {
			if(session!=null)
				session.close();
		}
		return l;
	}

	@Override
	public boolean update(Edificio e) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(e);
			transaction.commit();
		} catch (HibernateException ex) {
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
	public boolean delete(Edificio e) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result = true;
		try {
			transaction = session.beginTransaction();
			session.delete(e);
			transaction.commit();
		}catch (HibernateException ex) {
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
	private static final Log log = LogFactory.getLog(EdificioHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Edificio transientInstance) {
		log.debug("persisting Edificio instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Edificio instance) {
		log.debug("attaching dirty Edificio instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Edificio instance) {
		log.debug("attaching clean Edificio instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Edificio persistentInstance) {
		log.debug("deleting Edificio instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Edificio merge(Edificio detachedInstance) {
		log.debug("merging Edificio instance");
		try {
			Edificio result = (Edificio) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Edificio findById(EdificioId id) {
		log.debug("getting Edificio instance with id: " + id);
		try {
			Edificio instance = (Edificio) sessionFactory.getCurrentSession().get("Edificio", id);
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

	public List findByExample(Edificio instance) {
		log.debug("finding Edificio instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("Edificio").add(Example.create(instance))
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
