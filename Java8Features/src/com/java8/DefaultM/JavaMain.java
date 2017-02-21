package com.java8.DefaultM;

public class JavaMain {

	public static void main(String[] args) {
		JavaInterface1 javaInt1 = new JavaInterface1Impl() ;
		javaInt1.method1();
		javaInt1.method1(1);
		javaInt1.method1(1,2);
		javaInt1.method1(1,2,3);
		JavaInterface1 javaInt2 = new JavaInterface1Impl2() ;
		javaInt2.method1();
		javaInt2.method1(1);
		javaInt2.method1(1,2);
		javaInt2.method1(1,2,3);
		JavaInterface1 javaInt3 = new JavaInterface1Impl3() ;
		javaInt3.method1();
		javaInt3.method1(1);
		javaInt3.method1(1,2);
		javaInt3.method1(1,2,3);
		JavaInterface1.method2();
}
}
