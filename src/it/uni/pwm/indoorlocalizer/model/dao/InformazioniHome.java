package it.uni.pwm.indoorlocalizer.model.dao;
// default package
// Generated 8-nov-2017 10.12.07 by Hibernate Tools 5.2.5.Final

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import it.uni.pwm.indoorlocalizer.model.pojo.Informazioni;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.HibernateUtil;

/**
 * Home object for domain model class Informazioni.
 * @see .Informazioni
 * @author Hibernate Tools
 */
public class InformazioniHome implements InformazioniDao{

private static Logger log= LogManager.getLogger("");
	
	@Override
	public int create(Informazioni i) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		int id=0;
		try {
			transaction = session.beginTransaction();
			id= (Integer) session.save(i);
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
	public List<Informazioni> retrive() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Informazioni> l = null;
		try {
		   l=(List<Informazioni>) session.createNativeQuery("Select * from informazioni").addEntity(Informazioni.class).list();
		}catch (HibernateException e) {
			log.error(e);
		}finally {
			if(session!=null)
				session.close();
		}
		return l;
	}

	@Override
	public boolean update(Informazioni i) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(i);
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
	public boolean delete(Informazioni i) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result = true;
		try {
			transaction = session.beginTransaction();
			session.delete(i);
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
	
	private static final Log log = LogFactory.getLog(InformazioniHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Informazioni transientInstance) {
		log.debug("persisting Informazioni instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Informazioni instance) {
		log.debug("attaching dirty Informazioni instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Informazioni instance) {
		log.debug("attaching clean Informazioni instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Informazioni persistentInstance) {
		log.debug("deleting Informazioni instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Informazioni merge(Informazioni detachedInstance) {
		log.debug("merging Informazioni instance");
		try {
			Informazioni result = (Informazioni) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Informazioni findById(java.lang.Integer id) {
		log.debug("getting Informazioni instance with id: " + id);
		try {
			Informazioni instance = (Informazioni) sessionFactory.getCurrentSession().get("Informazioni", id);
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

	public List findByExample(Informazioni instance) {
		log.debug("finding Informazioni instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("Informazioni")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}*/
}
