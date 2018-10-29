package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class studentDao {
	public static void save(student s)
	{
		Configuration conf=new Configuration().configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
		session.save(s);
		ts.commit();
		session.close();
	}
}
