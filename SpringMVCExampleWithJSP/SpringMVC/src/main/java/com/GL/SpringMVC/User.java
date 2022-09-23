package com.GL.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class User {
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
	public String login(@RequestParam String userName,@RequestParam String password){
		System.out.println("Login Method = "+userName);
		if(userName.equals("vinay") && password.equals("vinay"))
			return "welcome";
		else
			return "error";
	}

}
