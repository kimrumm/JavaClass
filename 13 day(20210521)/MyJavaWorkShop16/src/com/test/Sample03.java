package com.test;
import java.util.Scanner;

public class Sample03 {
	static int getInputValue() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) {
		System.out.print("��ȣ�� �Է����ּ���.");
		int num = getInputValue();
		if(num == 0) {
			System.out.println("0�Դϴ�.");
		} else {
			System.out.println("0�� �ƴմϴ�.");
		}
		System.out.print("��ȣ�� �Է����ּ���.");
		int num2 = getInputValue();
		if(num == 10) {
			System.out.println("10�Դϴ�.");
		} else if(num == 20) { 
			System.out.println("20�Դϴ�.");
		} else {
			System.out.println("10, 20�� �ƴմϴ�.");
		}
		switch(num) {
			case 100:
				System.out.println("100�Դϴ�.");
				break;
				
			case 200:
				System.out.println("200�Դϴ�.");
				break;
				
			default:
				System.out.println("100, 200�� �ƴմϴ�.");
		}
	}
}





