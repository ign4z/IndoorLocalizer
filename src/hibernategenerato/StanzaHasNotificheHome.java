// default package
// Generated 3-nov-2017 12.16.26 by Hibernate Tools 5.2.5.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class StanzaHasNotifiche.
 * @see .StanzaHasNotifiche
 * @author Hibernate Tools
 */
public class StanzaHasNotificheHome {

	private static final Log log = LogFactory.getLog(StanzaHasNotificheHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(StanzaHasNotifiche transientInstance) {
		log.debug("persisting StanzaHasNotifiche instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StanzaHasNotifiche instance) {
		log.debug("attaching dirty StanzaHasNotifiche instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StanzaHasNotifiche instance) {
		log.debug("attaching clean StanzaHasNotifiche instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StanzaHasNotifiche persistentInstance) {
		log.debug("deleting StanzaHasNotifiche instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StanzaHasNotifiche merge(StanzaHasNotifiche detachedInstance) {
		log.debug("merging StanzaHasNotifiche instance");
		try {
			StanzaHasNotifiche result = (StanzaHasNotifiche) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StanzaHasNotifiche findById(StanzaHasNotificheId id) {
		log.debug("getting StanzaHasNotifiche instance with id: " + id);
		try {
			StanzaHasNotifiche instance = (StanzaHasNotifiche) sessionFactory.getCurrentSession()
					.get("StanzaHasNotifiche", id);
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

	public List findByExample(StanzaHasNotifiche instance) {
		log.debug("finding StanzaHasNotifiche instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("StanzaHasNotifiche")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
