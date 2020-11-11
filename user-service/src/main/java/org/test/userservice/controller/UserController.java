package org.test.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("name")
	public String getUserName() {
		return "My name is Test";
	}

}
