package com.test;

class Employee {
	protected String name;
	protected int age;
	public Employee() {}
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void working() {
		System.out.println("���Ѵ�.");		
	}
	public void working(String location) {
		System.out.println(this.name + "�� " 
				+ location + "���� ���Ѵ�.");
	}
	static int salary;
	static {
		salary = 3000;
	}
	static void displaySalary() {
		System.out.println(salary);
	}	
}
class PartTimeEmployee extends Employee {
	public PartTimeEmployee(String name, int age) {
		super(name, age);		
	}
	public void eating() {
		System.out.println(this.name + "�� ���� �Դ�.");
	}
	public void working() {
		System.out.println("working overriding");
	}
}
public class Sample06 {
	public static void main(String[] args) {
		PartTimeEmployee pemp = 
				new PartTimeEmployee("ȫ�浿", 40);
		PartTimeEmployee.salary = 300;
		System.out.println(pemp.salary);
		pemp.displaySalary();
		pemp.eating();		
		Employee emp2 = new PartTimeEmployee("�������", 50);
		emp2.working();
		Employee emp3 = new Employee("������", 60);
//		Employee emp = new Employee();
//		Employee emp2 = new Employee("�̼���", 20);
//		emp2.working();
//		emp2.working("����");
//		Employee.displaySalary();
		
	}
}
