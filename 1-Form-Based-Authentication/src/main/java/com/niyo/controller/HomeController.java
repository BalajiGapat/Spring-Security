package com.niyo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController 
{
	@GetMapping("/home") // http://localhost:8080/api/home
	public ResponseEntity<?> homePage()
	{
		// return ResponseEntity.ok("this is home page...!!!");	
		// return new ResponseEntity<>("Hello", HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body("this is home page...!!!");
	}
}
