package com.app.agree.service.session;

import org.hibernate.Session;

public interface MySessionFactory {

	
	Session getSession();
	void setSession(Session session);
}
