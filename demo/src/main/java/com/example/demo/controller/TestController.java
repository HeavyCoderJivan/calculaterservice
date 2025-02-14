package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.MyNum;
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/method")
	public String myMethod() {
		return "Hello world";
	}
//split method pattern configuration
	@PostMapping("/add-post/{val1}/{val2}/{val3}")
	public String myPost(@RequestParam(required = false) String param1,@RequestParam String param2,
			@PathVariable int val1,	@PathVariable int val2,	@PathVariable int val3,@RequestBody MyNum reqbody )
	{
		boolean b=reqbody.equals(reqbody);
		System.out.println(b);
		int c=val1+val2+val3;
		return "This is post method" + param1 + " " + param2+"total"+c+"  "+reqbody;
			
	}
	
	

	
	

}
