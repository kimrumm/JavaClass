package com.test;
import java.util.Scanner;
public class WorkShop1_2 {
	public static float getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Float.parseFloat(inputString);		
	}
	public static void main(String[] args) {	
		// WorkShop1_2 �ۼ��Ͻÿ�. 
		// ��������� �Է�ó�� �����ϵ��� ó��
		// 15:00����	
		while(true) {
			System.out.print("Computer Science ������ �Է��ϼ��� : ");
			float a1 = getUserInput();
			System.out.print("Java Programming ������ �Է��ϼ��� : ");
			float a2 = getUserInput();
			System.out.print("���м��� ������ �Է��ϼ��� : ");
			float a3 = getUserInput();
			System.out.print("������� ���� ������ �Է��ϼ��� : ");
			float a4 = getUserInput();
			System.out.print("������ ������ �Է��ϼ��� : ");
			float a5 = getUserInput();
			System.out.println("=================================");
			boolean a1Check = (a1 >= 2.5)? true:false;
			boolean a2Check = (a2 >= 2.5)? true:false;
			boolean a3Check = (a3 >= 2.5)? true:false;
			boolean a4Check = (a4 >= 2.5)? true:false;
			boolean a5Check = (a5 >= 2.5)? true:false;
			boolean allCheck = a1Check 
					&& a2Check && a3Check && a4Check && a5Check;
			float totalScore = (a1 + a2 + a3 + a4 + a5)/5;
			float totalScore2 = totalScoreFunc(a1, a2, a3, a4, a5);
			System.out.println("������ " + totalScore + "�� �Դϴ�.");
			if(totalScore >= 3.7) {
				if(allCheck) {
					System.out.println("���� �б� ���б� ����� �Դϴ�.");
				}
			}
		}	
	}
	public static float totalScoreFunc(float a1,
			float a2, float a3, float a4, float a5) {
		return (a1 + a2 + a3 + a4 + a5)/5;
	}
}








