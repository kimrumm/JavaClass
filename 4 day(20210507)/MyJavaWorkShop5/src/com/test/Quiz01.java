package com.test;
import java.util.Scanner;
class Calculator3 {
	static int add(int a, int b) {
		return a + b;
	}
	static int subtract(int a, int b) {
		return a - b;
	}
	static int multiply(int a, int b) {
		return a * b;
	}
	static int divide(int a, int b) {
		return a / b;
	}
}
public class Quiz01 {	
	static int getInputValue() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();		
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) throws InterruptedException {
		// ####################
		// # 1. ����
		// # 2. ����
		// # 3. ����
		// # 4. ������
		// # 5. ����
		// ####################
		// # �޴��� �������ּ���. : 
		//
		// 1�� �����Ѱ��
		// ù��°���ڸ� �Է����ּ���. : 5
		// �ι�°���ڸ� �Է����ּ���. : 5
		// ����� 10�Դϴ�.
		// ��. ���Ḧ ���������� ��� �ݺ������� ó���ϵ��� �����Ͻÿ�.
		// ��Ģ������ �޼ҵ�� �����Ͻÿ�. 15:20, 15:30 ~ 16:00
		int num1, num2, result;
		for(;;) {
			System.out.println("####################");
			System.out.println("# 1. ����");
			System.out.println("# 2. ����");
			System.out.println("# 3. ����");
			System.out.println("# 4. ������");
			System.out.println("# 5. ����");
			System.out.println("####################");
			System.out.print("# �޴��� �������ּ���. : ");
			int selNum = getInputValue();
			switch(selNum) {
			case 1:
				System.out.print("ù��° ���ڸ� �Է����ּ���. : ");
				num1 = getInputValue();
				System.out.print("�ι�° ���ڸ� �Է����ּ���. : ");
				num2 = getInputValue();
				result = Calculator3.add(num1, num2);
				System.out.println("����� " + result + "�Դϴ�.");
				Thread.sleep(1000);
				break;
			case 2:
				System.out.print("ù��° ���ڸ� �Է����ּ���. : ");
				num1 = getInputValue();
				System.out.print("�ι�° ���ڸ� �Է����ּ���. : ");
				num2 = getInputValue();
				result = Calculator3.subtract(num1, num2);
				System.out.println("����� " + result + "�Դϴ�.");
				Thread.sleep(1000);
				break;
			case 3:
				System.out.print("ù��° ���ڸ� �Է����ּ���. : ");
				num1 = getInputValue();
				System.out.print("�ι�° ���ڸ� �Է����ּ���. : ");
				num2 = getInputValue();
				result = Calculator3.multiply(num1, num2);
				System.out.println("����� " + result + "�Դϴ�.");
				Thread.sleep(1000);
				break;
			case 4:
				System.out.print("ù��° ���ڸ� �Է����ּ���. : ");
				num1 = getInputValue();
				System.out.print("�ι�° ���ڸ� �Է����ּ���. : ");
				num2 = getInputValue();
				result = Calculator3.divide(num1, num2);
				System.out.println("����� " + result + "�Դϴ�.");
				Thread.sleep(1000);
				break;
			case 5:	
				System.out.println("����");
				System.exit(0);
				break;				
			}
		}
	}

}
