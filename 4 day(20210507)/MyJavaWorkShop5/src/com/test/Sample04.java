package com.test;
class Dog {
	String name;
	String color;
	void barking() {
		System.out.println("�̸��� " 
				+ name + "�̰� ������ " 
				+ color + "�� ¢�´�.");
	}
}
public class Sample04 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "�޸�";
		dog.color = "���";
		dog.barking();
		Dog dog2 = dog;
		dog2.barking();
	}
}
// ������ 237 6-1, 6-2, 6-3








