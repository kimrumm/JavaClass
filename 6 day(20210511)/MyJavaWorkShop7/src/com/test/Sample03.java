package com.test;
class Student extends Object {
	String name;
	void studying() {System.out.println(name + "�� �����ϴ�.");	}
}
class MiddleStudent extends Student {
	void eating() { System.out.println(name); }
}
class Point {
	int x;
	int y;
}
class Point3D extends Point {
	int z;
}
public class Sample03 {
	public static void main(String[] args) {
		MiddleStudent mstu = new MiddleStudent();
		mstu.name = "�̼���";
		mstu.studying();
		mstu.eating();
		Student stu = new Student();
		Point3D p = new Point3D();
		p.x = 10;
		p.y = 20;
		p.z = 30;
				
	}
}
