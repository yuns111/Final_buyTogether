package com.buy.together.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public void login() {
		
	}

}
