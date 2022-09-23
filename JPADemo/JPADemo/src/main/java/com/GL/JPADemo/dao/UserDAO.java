package com.GL.JPADemo.dao;

import java.util.List;

import com.GL.JPADemo.entity.User;



public interface UserDAO {
	public void addUser(User user);
	public List<User> findAll(); 
	public User findById(int id);
	public void deletById(int id);
	public void update(User user);
	
}
