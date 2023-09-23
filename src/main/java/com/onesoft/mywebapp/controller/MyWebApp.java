package com.onesoft.mywebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebApp {

	@GetMapping(value = "name")
	public String getname() {
		return "Hi Hello Vanakkam Makkaley I'm --> Venkateswaran  <--";
	}

}
