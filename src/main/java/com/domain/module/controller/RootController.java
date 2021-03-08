package com.domain.module.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.module.service.TemplateService;

@RestController
public class RootController {
	@Autowired
	TemplateService service;
	
	@GetMapping("/")
	public String root() throws Exception {
		return "<h1>Hello Spring Boot World (with. Tibero)</h1>" + service.getNow();
	}
}
