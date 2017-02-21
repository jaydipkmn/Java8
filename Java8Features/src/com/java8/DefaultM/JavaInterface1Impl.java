package com.java8.DefaultM;

public class JavaInterface1Impl implements JavaInterface1{

	@Override
	public void method1() {
		method1(0);
		
	}
	
	@Override
	public void method1(int a) {
		method1(0,a);
		
	}
	@Override
	public void method1(int a, int b) {
		System.out.println("method " +a + " Method " +b);
		
	}

}
