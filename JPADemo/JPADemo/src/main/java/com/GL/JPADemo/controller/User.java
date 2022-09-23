package com.GL.JPADemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.GL.JPADemo.service.UserService;



@Controller
@RequestMapping("/user")
public class User {
	private UserService userService;
	
	@Autowired
	public User(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/")
	public String welcome() {
		//model.addAttribute("name",name);
		return "index";
	}
	@PostMapping("/")
	public String check() {
		return "Hello";
	}
	@PostMapping("/login")
	public ModelAndView login(@RequestParam String userName,@RequestParam String password){
//		System.out.println("Login Method = "+userName);
//		if(userName.equals("GL") && password.equals("GL"))
		String result = userService.login(userName,password);
		if(result.equals("valid user"))
		{
			List <com.GL.JPADemo.entity.User> userList = this.getList();
			ModelAndView model = new ModelAndView("welcome");
			model.addObject("users",userList);
			return model;
			
		}
		return null;	
	}
	@GetMapping("/registerPage")
	public String registerPage() {
		return "register";
	}
	@PostMapping("/registerUser")
	public String addUser(@RequestParam String userName
			,@RequestParam String password
			,@RequestParam String email
			,@RequestParam String firstName
			,@RequestParam String lastName
			,@RequestParam int id)
	{
		System.out.println("User is added"+email);
		com.GL.JPADemo.entity.User user = new com.GL.JPADemo.entity.User();
		user.setId(id);
		user.setPassword(password);
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		String result = userService.register(user);
		
		return "index";
		
	}
	private List<com.GL.JPADemo.entity.User> getList(){
		return userService.getUsers();
	}

}
