package com.example.apiTest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ApiController {
	

	@GetMapping("/")
	public ResponseEntity<Object> getHelloWorld(){
		log.info("testando lombok");
		return new ResponseEntity<>("ola mundo modificacao 123",HttpStatus.OK);
	}
	

}
