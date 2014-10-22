package com.app.agree.dao;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.app.agree.domain.Fieldweed;


/**
 * Home object for domain model class Fieldweed.
 * @see com.app.agree.domain.Fieldweed
 * @author Hibernate Tools
 */
public class FieldweedHome {

	private static final Log log = LogFactory.getLog(FieldweedHome.class);

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

	public void persist(Fieldweed transientInstance) {
		log.debug("persisting Fieldweed instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Fieldweed instance) {
		log.debug("attaching dirty Fieldweed instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fieldweed instance) {
		log.debug("attaching clean Fieldweed instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Fieldweed persistentInstance) {
		log.debug("deleting Fieldweed instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fieldweed merge(Fieldweed detachedInstance) {
		log.debug("merging Fieldweed instance");
		try {
			Fieldweed result = (Fieldweed) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Fieldweed findById(java.lang.Integer id) {
		log.debug("getting Fieldweed instance with id: " + id);
		try {
			Fieldweed instance = (Fieldweed) sessionFactory.getCurrentSession()
					.get("com.xmlxsd.my.domain.Fieldweed", id);
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

	public List findByExample(Fieldweed instance) {
		log.debug("finding Fieldweed instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.xmlxsd.my.domain.Fieldweed")
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
