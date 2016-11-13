package com.njproject.remotekid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	public static final String TAG = LoginController.class.getCanonicalName();
	

	@RequestMapping(method = RequestMethod.GET, value="/login/login.json")
	@ResponseBody
	public String login() {		
		return "login swyu !!!!";
	}
	
	
//	@RequestMapping("/greet/{name}")
//	public String greet(@PathVariable("name") String name) {
//		return "greet";
//	}
	

}
