package com.java.serviceImpl;

import com.java.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public void m1() {
		System.out.println("m1--StudentserviceImpl");
		
	}

	@Override
	public int addition(int x, int y) {
		System.out.println(x+y);
		return x+y;
	}

}
