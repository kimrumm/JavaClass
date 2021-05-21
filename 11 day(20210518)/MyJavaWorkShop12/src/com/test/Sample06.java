package com.test;
public class Sample06 {
	static class StaticClass{
		void testMethod2() { 
			System.out.println("testMethod2 in StaticClass " + b); 
		}
	}
	static int b = 30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample06 obj = new Sample06();
//		Sample06.InnerClass obj2 = 
//				obj.new InnerClass();
//		obj2.testMethod();		
		Sample06.StaticClass obj3 = new Sample06.StaticClass();
		obj3.testMethod2();
	}
	private int a = 10;
	class InnerClass{
		void testMethod() { 
			System.out.println("testMethod in innerClass");
		}
	}
}
