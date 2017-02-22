package com.java8.DefaultM;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflactionMainClass {

	public static void main(String[] args) {
		String javaInterface1Name = "com.java8.DefaultM.JavaInterface1Impl";
		String methodName = "method1";
		Class<?>[] paramTypes = {int.class,int.class, int.class};
		 try {
			Class<?> javaInterfaceImplClass  = Class.forName(javaInterface1Name);
			Object javaInterfaceImpl = javaInterfaceImplClass.newInstance();
			
			Method method = javaInterfaceImpl.getClass().getMethod(methodName, paramTypes);
			
			method.invoke(javaInterfaceImpl,1,1,1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
