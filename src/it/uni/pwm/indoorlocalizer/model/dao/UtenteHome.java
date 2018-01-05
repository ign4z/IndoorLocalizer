package it.uni.pwm.indoorlocalizer.model.dao;
// default package

// Generated 8-nov-2017 10.12.07 by Hibernate Tools 5.2.5.Final

import java.util.List;
import javax.naming.InitialContext;
import javax.persistence.NoResultException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.HibernateUtil;

public class UtenteHome implements UtenteDao {

	private static Logger log = LogManager.getLogger("");

	@Override
	public int create(Utente u) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		int id = 0;
		try {
			transaction = session.beginTransaction();
			id = (Integer) session.save(u);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			log.error(e);
		} finally {
			if (session != null) // spesso omesso
				session.close();
		}
		return id;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Utente> retrive() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Utente> l = null;
		try {
			l = (List<Utente>) session.createNativeQuery("Select * from utente").addEntity(Utente.class).list();
		} catch (HibernateException e) {
			log.error(e);
		} finally {
			if (session != null)
				session.close();
		}
		return l;
	}

	@Override
	public Utente exist(String email) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Utente u = null;
		try {
			Query<Utente> q = session.createNativeQuery("Select * from utente where email = ?").addEntity(Utente.class);
			q.setParameter(1, email);
			u = q.getSingleResult();
		} catch (HibernateException e) {
			log.error(e);
		} catch (NoResultException nre) {

		} finally {
			if (session != null)
				session.close();
		}
		return u;
	}

	@Override
	public Utente retriveFromId(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Utente u = null;
		try {
			Query<Utente> q = session.createNativeQuery("Select * from utente where id = ?").addEntity(Utente.class);
			q.setParameter(1, id);
			u = q.getSingleResult();
		} catch (HibernateException e) {
			log.error(e);
		} catch (NoResultException nre) {

		} finally {
			if (session != null)
				session.close();
		}
		return u;
	}

	@Override
	public Utente login(String email, String pwd) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Utente u = null;
		try {
			Query<Utente> q = session.createNativeQuery("Select * from utente where email = ? and pwd = ?")
					.addEntity(Utente.class);
			q.setParameter(1, email);
			q.setParameter(2, pwd);
			u = q.getSingleResult();
		} catch (HibernateException e) {
			log.error(e);
		} catch (NoResultException nre) {

		} finally {
			if (session != null)
				session.close();
		}
		return u;
	}

	@Override
	public boolean update(Utente u) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result = true;
		try {
			transaction = session.beginTransaction();
			session.update(u);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result = false;
			log.error(e);
		} finally {
			if (session != null)
				session.close();
		}
		return result;
	}

	@Override
	public boolean delete(Utente u) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result = true;
		try {
			transaction = session.beginTransaction();
			session.delete(u);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result = false;
			log.error(e);
		} finally {
			if (session != null)
				session.close();
		}
		return result;
	}

	// public void persist(Utente transientInstance) {
	// log.debug("persisting Utente instance");
	// try {
	// sessionFactory.getCurrentSession().persist(transientInstance);
	// log.debug("persist successful");
	// } catch (RuntimeException re) {
	// log.error("persist failed", re);
	// throw re;
	// }
	// }
	//
	// public void attachDirty(Utente instance) {
	// log.debug("attaching dirty Utente instance");
	// try {
	// sessionFactory.getCurrentSession().saveOrUpdate(instance);
	// log.debug("attach successful");
	// } catch (RuntimeException re) {
	// log.error("attach failed", re);
	// throw re;
	// }
	// }
	//
	// public void attachClean(Utente instance) {
	// log.debug("attaching clean Utente instance");
	// try {
	// sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
	// log.debug("attach successful");
	// } catch (RuntimeException re) {
	// log.error("attach failed", re);
	// throw re;
	// }
	// }
	//
	// public void delete(Utente persistentInstance) {
	// log.debug("deleting Utente instance");
	// try {
	// sessionFactory.getCurrentSession().delete(persistentInstance);
	// log.debug("delete successful");
	// } catch (RuntimeException re) {
	// log.error("delete failed", re);
	// throw re;
	// }
	// }
	//
	// public Utente merge(Utente detachedInstance) {
	// log.debug("merging Utente instance");
	// try {
	// Utente result = (Utente)
	// sessionFactory.getCurrentSession().merge(detachedInstance);
	// log.debug("merge successful");
	// return result;
	// } catch (RuntimeException re) {
	// log.error("merge failed", re);
	// throw re;
	// }
	// }
	//
	// public Utente findById(java.lang.Integer id) {
	// log.debug("getting Utente instance with id: " + id);
	// try {
	// Utente instance = (Utente) sessionFactory.getCurrentSession().get("Utente",
	// id);
	// if (instance == null) {
	// log.debug("get successful, no instance found");
	// } else {
	// log.debug("get successful, instance found");
	// }
	// return instance;
	// } catch (RuntimeException re) {
	// log.error("get failed", re);
	// throw re;
	// }
	// }
	//
	// public List findByExample(Utente instance) {
	// log.debug("finding Utente instance by example");
	// try {
	// List results =
	// sessionFactory.getCurrentSession().createCriteria("Utente").add(Example.create(instance))
	// .list();
	// log.debug("find by example successful, result size: " + results.size());
	// return results;
	// } catch (RuntimeException re) {
	// log.error("find by example failed", re);
	// throw re;
	// }
	// }
}
