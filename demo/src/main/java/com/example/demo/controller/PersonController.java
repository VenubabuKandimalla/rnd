package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Person;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@GetMapping
	public Person getPerson() {
		return new Person("Tom", "Cruise");
	}

}
