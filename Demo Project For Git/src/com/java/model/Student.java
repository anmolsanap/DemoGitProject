package com.java.model;

import com.java.service.StudentService;
import com.java.serviceImpl.StudentServiceImpl;

public class Student {

	StudentService studentService = new StudentServiceImpl();
	
	public void m1()
	{
		System.out.println("m1--Student");
		studentService.m1();
	}

	public void m3()
	{
		System.out.println("m3--Student");
		
	}
	
	public int addition(int x, int y)
	{
		int z =studentService.addition(x,y);
		System.out.println(x+y);
		return x+y;
	}
	public int subtraction(int x, int y)
	{
		int z =studentService.subtraction(x,y);
		System.out.println(x+y);
		return x+y;
	}
}
