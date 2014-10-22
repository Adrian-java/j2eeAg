package com.app.agree.service.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession implements MySessionFactory {

	 private Session session;

	public HibernateSession() {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		this.session = sessionFactory.openSession();
		this.session.beginTransaction();
	}

	// session.beginTransaction();

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
