package com.app.agree.dao;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.app.agree.domain.Plantprotectprroduct;


/**
 * Home object for domain model class Plantprotectprroduct.
 * @see com.app.agree.domain.Plantprotectprroduct
 * @author Hibernate Tools
 */
public class PlantprotectprroductHome {

	private static final Log log = LogFactory
			.getLog(PlantprotectprroductHome.class);

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

	public void persist(Plantprotectprroduct transientInstance) {
		log.debug("persisting Plantprotectprroduct instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Plantprotectprroduct instance) {
		log.debug("attaching dirty Plantprotectprroduct instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Plantprotectprroduct instance) {
		log.debug("attaching clean Plantprotectprroduct instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Plantprotectprroduct persistentInstance) {
		log.debug("deleting Plantprotectprroduct instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Plantprotectprroduct merge(Plantprotectprroduct detachedInstance) {
		log.debug("merging Plantprotectprroduct instance");
		try {
			Plantprotectprroduct result = (Plantprotectprroduct) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Plantprotectprroduct findById(java.lang.Integer id) {
		log.debug("getting Plantprotectprroduct instance with id: " + id);
		try {
			Plantprotectprroduct instance = (Plantprotectprroduct) sessionFactory
					.getCurrentSession().get(
							"com.xmlxsd.my.domain.Plantprotectprroduct", id);
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

	public List findByExample(Plantprotectprroduct instance) {
		log.debug("finding Plantprotectprroduct instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria("com.xmlxsd.my.domain.Plantprotectprroduct")
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
