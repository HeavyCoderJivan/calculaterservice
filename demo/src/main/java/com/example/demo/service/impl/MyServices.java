package com.example.demo.service.impl;
import org.springframework.stereotype.Component;
import com.example.demo.service.interfaces.IMyService;
@Component
public class MyServices implements IMyService {
	public int add(int num1, int num2)
	{
		System.out.println("MyServices Implementd:"+"Num1: "+num1+"num-2:"+num2);
		int sum=num1+num2;
		return sum;
	}

}
