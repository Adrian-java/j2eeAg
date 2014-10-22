package com.app.agree.dao;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.app.agree.domain.Plant;


/**
 * Home object for domain model class Plant.
 * @see com.app.agree.domain.Plant
 * @author Hibernate Tools
 */
public class PlantHome {

	private static final Log log = LogFactory.getLog(PlantHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Plant transientInstance) {
		log.debug("persisting Plant instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Plant instance) {
		log.debug("attaching dirty Plant instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Plant instance) {
		log.debug("attaching clean Plant instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Plant persistentInstance) {
		log.debug("deleting Plant instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Plant merge(Plant detachedInstance) {
		log.debug("merging Plant instance");
		try {
			Plant result = (Plant) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Plant findById(java.lang.Integer id) {
		log.debug("getting Plant instance with id: " + id);
		try {
			Plant instance = (Plant) sessionFactory.getCurrentSession().get(
					"com.xmlxsd.my.domain.Plant", id);
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

	public List findByExample(Plant instance) {
		log.debug("finding Plant instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.xmlxsd.my.domain.Plant")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
