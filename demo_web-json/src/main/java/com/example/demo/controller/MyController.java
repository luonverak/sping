package com.example.demo.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.People;
@RestController
public class MyController {

	
	@GetMapping("/json")
	public List<People> data()
	{
		List<People> list=Arrays.asList(new People(1001,"Verak","Male",20,"PP"));
		return list;
	}
}
