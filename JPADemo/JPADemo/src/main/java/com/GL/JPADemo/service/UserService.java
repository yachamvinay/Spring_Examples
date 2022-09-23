package com.GL.JPADemo.service;

import java.util.List;

import com.GL.JPADemo.entity.User;

public interface UserService {
	public String login(String userName,String password);
	public String register(User user);
	public List<User> getUsers();
}
