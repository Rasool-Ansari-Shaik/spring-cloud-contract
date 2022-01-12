package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@GetMapping("hello")
	public String getMessage() {
		return demoService.getMessage();
	}
}
