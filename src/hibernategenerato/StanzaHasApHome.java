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
 * Home object for domain model class StanzaHasAp.
 * @see .StanzaHasAp
 * @author Hibernate Tools
 */
public class StanzaHasApHome {

	private static final Log log = LogFactory.getLog(StanzaHasApHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(StanzaHasAp transientInstance) {
		log.debug("persisting StanzaHasAp instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StanzaHasAp instance) {
		log.debug("attaching dirty StanzaHasAp instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StanzaHasAp instance) {
		log.debug("attaching clean StanzaHasAp instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StanzaHasAp persistentInstance) {
		log.debug("deleting StanzaHasAp instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StanzaHasAp merge(StanzaHasAp detachedInstance) {
		log.debug("merging StanzaHasAp instance");
		try {
			StanzaHasAp result = (StanzaHasAp) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StanzaHasAp findById(StanzaHasApId id) {
		log.debug("getting StanzaHasAp instance with id: " + id);
		try {
			StanzaHasAp instance = (StanzaHasAp) sessionFactory.getCurrentSession().get("StanzaHasAp", id);
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

	public List findByExample(StanzaHasAp instance) {
		log.debug("finding StanzaHasAp instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("StanzaHasAp")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
