import java.util.Scanner;

public class WorkShop1_1_Demo {

	public static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) {	
		int b1, b2, b3, b4;
		b1 = 2000;
		b2 = 3000;
		b3 = 1500;
		b4 = 500;			
		System.out.println("=========�޴�=========");
		System.out.println("1.�Ƹ޸�ī��  2000��");
		System.out.println("2.ī���  3000��");
		System.out.println("3.���̱�	1500��");
		System.out.println("4.ũ��ġ��  500��");
		System.out.println("=========�ֹ�=========");
		System.out.printf("�Ƹ޸�ī�� �ֹ� ���� :");
		int a1 = getUserInput();
		System.out.printf("ī��� �ֹ� ���� :");
		int a2 = getUserInput();
		System.out.printf("���̱� �ֹ� ���� :");
		int a3 = getUserInput();
		System.out.printf("ũ��ġ�� �ֹ� ���� :");
		int a4 = getUserInput();
		System.out.println("=========�ݾ�=========");
		System.out.printf("�Ƹ޸�ī�� : %d��\n", a1 * b1);		
		System.out.printf("ī��� : %d��\n", a2 * b2);
		System.out.printf("���̱� : %d��\n", a3 * b3);
		System.out.printf("ũ��ġ�� : %d��\n", a4 * b4);
		System.out.println("=========�ֹ�=========");
		int totalPrice = (a1 * b1) + (a2 * b2) + 
				(a3 * b3) + (a4 * b4);
		System.out.println("�� ���� �ݾ� : " + totalPrice);
		float point = 0;
		if(totalPrice >= 30000) {
			point = totalPrice * 0.02f;
			// 0.02f
		} else if(12000 <= totalPrice && 30000 > totalPrice) {
			// 0.01f
			point = totalPrice * 0.01f;
		}
		System.out.println("����Ʈ ���� : " + (int)point);
		
	}
}



