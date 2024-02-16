package com.example.ratemeterpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratemeterpoc.service.MyServiceImpl;

@RestController
public class MyController {
	
	@Autowired
	public MyServiceImpl myService;
	
	@GetMapping("/getResponse")
	public String myEndpoint() {
		for (int i=0; i<20; i++) {
			myService.processRequest();
			}
		return "hello";
		
	}

}
