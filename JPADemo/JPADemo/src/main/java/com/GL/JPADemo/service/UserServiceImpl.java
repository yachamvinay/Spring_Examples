package com.GL.JPADemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GL.JPADemo.dao.UserDAO;
import com.GL.JPADemo.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDao;
	@Override
	public String login(String userName,String password) {
		// TODO Auto-generated method stub
		List<User> users = userDao.findAll();
		System.out.println("username = "+userName);
		System.out.println(users);
		int counter = 0;
		
		for(User user : users) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
				return "valid user";
			counter++;
		}
		if(counter==0) {
			return "invalid user";
		}
		else {
			return "";
		}
		
	}

	@Override
	public String register(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
		
		return "index";
	}

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

}
