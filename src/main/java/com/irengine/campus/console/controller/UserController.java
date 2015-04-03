package com.irengine.campus.console.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	  @RequestMapping("/user")
	  public Principal user(Principal user) {
	    return user;
	  }
	  
	  @RequestMapping(value = "/user", method = RequestMethod.POST)
	  public Principal safeUser(Principal user) {
	    return user;
	  }
	  
}
