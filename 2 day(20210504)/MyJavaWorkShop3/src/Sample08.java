import java.util.Scanner;

public class Sample08 {
	public static void main(String[] args) {
//      15:30 ~ 15:50 (20) => 
//		���� ȭ���� ����ϰ� �ش� �޴� ��ȣ�� ������ ���
//		�޼����� ����Ͻÿ�.
//		##########################
//		# 1. ����
//		# 2. ����
//		# 3. ����
//		# 4. ������
//		# 5. ����
//		##########################	
//		# �޴� ��ȣ�� �Է����ּ���. : 
//		1 => �����Դϴ�.
		System.out.println("##########################");
		System.out.println("# 1. ����");
		System.out.println("# 2. ����");
		System.out.println("# 3. ����");
		System.out.println("# 4. ������");
		System.out.println("# 5. ����");
		System.out.println("##########################");
		System.out.printf("�޴� ��ȣ�� �Է����ּ���. :");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();		
//		if(num.equals("1")) {
//		System.out.println("�����Դϴ�.");
//		}
		int num2 = Integer.parseInt(num);
		if(num2 == 1){
			System.out.println("�����Դϴ�.");
		} else if(num2 == 2){
			System.out.println("�����Դϴ�.");
		} else if(num2 == 3){
			System.out.println("�����Դϴ�.");
		} else if(num2 == 4){
			System.out.println("�������Դϴ�.");
		} else if(num2 == 5) {
			System.out.println("����.");
		} else {
			System.out.println("�ٽ� �Է����ּ���.");
		}

		
		
		
		
		
		
		
		
		
	}
}
