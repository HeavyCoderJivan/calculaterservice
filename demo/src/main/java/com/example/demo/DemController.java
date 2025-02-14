package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calculater")
public class DemController
{
	@GetMapping("/add")
	public int add(@RequestParam int a,@RequestParam int b) 
	{
		return a*b;
	}
	@GetMapping("/sub")
	public int sum(@RequestParam int a,@RequestParam int b) 
	{
		int sub=0;
		if(a>b) {
			sub= a-b;
		}
		else if(b>a)
		{
			sub= b-a;	
		}
		
		return sub;
		
	}
	@GetMapping("/mul")
	public int mul(@RequestParam int a,@RequestParam int b)
	{
		return a*b;	
	}
	@GetMapping("/div")
	public int  div(@RequestParam int a,@RequestParam int b) 
	{
	   return a/b;	
	}
	@PostMapping("/add-post")
	public int addPost(@RequestParam int a,@RequestParam int b)
	{
		return a+	b;
	}
	

}
