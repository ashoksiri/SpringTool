package com.msr.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.msr.spring.dto.User;


@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {
	
	 public void saveUser(User user) {
	        persist(user);
	    }
	 
	    @SuppressWarnings("unchecked")
	    public List<User> findAllUsers() {
	        Criteria criteria = getSession().createCriteria(User.class);
	        return (List<User>) criteria.list();
	    }
	 
	    public void deleteUserBySsn(String ssn) {
	        Query query = getSession().createSQLQuery("delete from User where username = :ssn");
	        query.setString("username", ssn);
	        query.executeUpdate();
	    }
	 
	     
	    public User findBySsn(String ssn){
	        Criteria criteria = getSession().createCriteria(User.class);
	        criteria.add(Restrictions.eq("username",ssn));
	        return (User) criteria.uniqueResult();
	    }
	     
	    public void updateUser(User user){
	        getSession().update(user);
	    }

}
