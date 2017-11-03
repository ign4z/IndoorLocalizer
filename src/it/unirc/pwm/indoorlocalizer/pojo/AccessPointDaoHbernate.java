package it.unirc.pwm.indoorlocalizer.pojo;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.indoorlocalizer.util.HibernateUtil;



public class AccessPointDaoHbernate implements AccessPointDao{

	
	
	@Override
	public String create(AccessPoint ap) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		String id = null;
		try {
			transaction = session.beginTransaction();
			id= (String) session.save(ap);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return id;
	}

	@Override
	public List<AccessPoint> retrive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(AccessPoint ap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(AccessPoint ap) {
		// TODO Auto-generated method stub
		return false;
	}

}
