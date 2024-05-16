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
	
	public int addition(int x, int y)
	{
		int z =studentService.addition(x,y);
		System.out.println(x+y);
		return x+y;
	}
}
