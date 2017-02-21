package com.java8.DefaultM;

public interface JavaInterface1 {

	public void method1();
	public void method1(int a);
	public void method1(int a, int b);
	// default method
	default public void method1(int a, int b, int c)
	{
		System.out.println("this is interface method");
	}
	
	static void method2()
	{
		System.out.println("this is  static method");
	}
	}
