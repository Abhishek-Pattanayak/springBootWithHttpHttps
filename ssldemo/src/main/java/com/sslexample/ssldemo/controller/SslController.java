package com.sslexample.ssldemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SslController {
	
	@GetMapping("/testssl")
	public String testSsl() {
		return "Application is both HTTP and HTTPS Enabled";
	}

}
