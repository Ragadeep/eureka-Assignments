package com.cg.eureka.eurekaservice.resource;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/hello")
public class ClientController {
	
	
	
	@GetMapping
	public String home() {
		return "hello world and Hello capgemini";
	}
}
