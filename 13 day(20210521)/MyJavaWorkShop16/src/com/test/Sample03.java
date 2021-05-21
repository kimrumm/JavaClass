package com.test;
import java.util.Scanner;

public class Sample03 {
	static int getInputValue() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) {
		System.out.print("번호를 입력해주세요.");
		int num = getInputValue();
		if(num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("0이 아닙니다.");
		}
		System.out.print("번호를 입력해주세요.");
		int num2 = getInputValue();
		if(num == 10) {
			System.out.println("10입니다.");
		} else if(num == 20) { 
			System.out.println("20입니다.");
		} else {
			System.out.println("10, 20이 아닙니다.");
		}
		switch(num) {
			case 100:
				System.out.println("100입니다.");
				break;
				
			case 200:
				System.out.println("200입니다.");
				break;
				
			default:
				System.out.println("100, 200이 아닙니다.");
		}
	}
}





