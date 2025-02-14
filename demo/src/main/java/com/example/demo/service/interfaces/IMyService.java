package com.example.demo.service.interfaces;

public interface IMyService {

	public int add(int a,int b);
	default void m1() 
	{
		System.out.println("This is m1 method");
	}
}
