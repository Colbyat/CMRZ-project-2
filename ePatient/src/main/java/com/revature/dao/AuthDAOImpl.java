package com.revature.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.LoginEntry;
import com.revature.utility.Encryptor;
import com.revature.utility.HibernateSessionFactory;

public class AuthDAOImpl implements AuthDAO {

	/*
	 * login - returns the id of the person given a username and
	 * an unencrypted password
	 */
	@Override
	public int login(String username, String password) {
		
		Session s = null;
		Transaction tx = null;
		int id = -1;
		
		try {
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			
			/*CriteriaBuilder cb = s.getCriteriaBuilder();
			CriteriaQuery<LoginEntry> cq = cb.createQuery(LoginEntry.class);
			Root<LoginEntry> root = cq.from(LoginEntry.class);
			cq.select(root).where(cb.and(cb.equal(root.get("username"), username),
										cb.equal(root.get("password"), Encryptor.encrypt(password))));
			
			id = s.createQuery(cq).getSingleResult().getId();*/
			
			LoginEntry user = s.get(LoginEntry.class, username);
			if(user!=null && user.getPassword().equals(Encryptor.encrypt(password)))
				id = user.getPerson().getId();
			tx.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			s.close();
		}
		
		return id;
	}

}
