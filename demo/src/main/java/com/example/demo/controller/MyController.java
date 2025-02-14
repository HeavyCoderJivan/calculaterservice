package com.example.demo.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.MyNum;

import com.example.demo.service.interfaces.IMyService;
@RestController
@RequestMapping("/my-controller")
public class MyController
{
private IMyService myservice;

private ApplicationContext applicationContext;

public MyController( IMyService myservice,ApplicationContext applicationContext) 
{
	this.myservice=myservice;
	this.applicationContext=applicationContext;
}
	
@PostMapping("/prccess")
public String proccess(@RequestBody MyNum mynum) 
{
	System.out.println("Start");
	System.out.println(myservice+"  "+applicationContext);
	int total=myservice.add(mynum.getNum1(), mynum.getNum2());
	System.out.println(total);
	myservice.m1();
	System.out.println(mynum.getNum1()+" "+mynum.getNum2());
	
	
	String [] name=applicationContext.getBeanDefinitionNames();
	for(String s:name) 
	{
	System.out.println("name  "+s);	
	}
	
	System.out.println("Stop");
	return "proccessed invilde()"+mynum;
	
}

}
