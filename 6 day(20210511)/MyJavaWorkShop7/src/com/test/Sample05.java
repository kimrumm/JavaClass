package com.test;
class A {
	void aMethod() { System.out.println("aMethod in A Class"); }
}
class B extends A {
	void aMethod() { System.out.println("aMethod in B Class"); }
}
public class Sample05 {
	public static void main(String[] args) {
		B b = new B();
		b.aMethod();
	}
}
// 356������. ����ȯ.




