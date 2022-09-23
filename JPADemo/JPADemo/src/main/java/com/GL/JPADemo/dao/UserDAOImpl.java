package com.GL.JPADemo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.GL.JPADemo.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private EntityManager entityManager;
	List<User> users ;
	@Autowired
	public UserDAOImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(user);
	}

	@Override
	public List<User> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<User> theQuery = currentSession.createQuery("from User",User.class);
		List<User> users = theQuery.getResultList();
		System.out.println("List = "+users);
		return users;
	}

	@Override
	public User findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		User user = currentSession.get(User.class,id);
		return user;
	}

	@Override
	public void deletById(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<User> theQuery = currentSession.createQuery("delete from User where id = :id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();	
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
