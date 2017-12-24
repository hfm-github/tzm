package com.tzm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.tzm.bean.UserBean;

@Repository
public class UserDao {

	@Resource
	private SessionFactory sessionFactory;
	//private HibernateTemplate hibernateTemplate;
	
	public UserBean get(String userId) {
		Query query = sessionFactory.openSession().createQuery("from UserBean where userid=?");
		query.setString(0, userId);
		//query.setParameter(name, val, type)
		List list = query.list();
		return (UserBean) list.get(0);		
	}

	public void add(UserBean user){
		sessionFactory.openSession().save(user);
	}

	public void update(UserBean user){
		sessionFactory.openSession().update(user);
	}
	
	public void delete(UserBean user){
		sessionFactory.openSession().delete(user);
	}
	
}
