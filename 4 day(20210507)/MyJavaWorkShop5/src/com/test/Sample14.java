package com.test;
public class Sample14 {
//	static int add(int x, int y) {
//		return x + y;
//	}
//	static int add2(int x, int y, int z) {
//		return x + y + z;
//	}
	static int add(int a, int b) { return a + b; }
	static int add(int a, int b, int c) { return a + b + c; }
	static String add(String a, String b) { return a + b; }
	// Overloading �����ε�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add("��", "��"));
		System.out.println("1");
		System.out.println(1);
		System.out.println('c');		
	}
}




