package com.test2;
class MyException extends Exception {
	MyException(String msg){
		super(msg);
	}
}
public class Sample03 {
	static void checkMethod(int num) throws MyException {
		if (num % 2 == 0) {
			throw new MyException("¦���Դϴ�.");
		}
	}
	public static void main(String[] args) {
		try {
			throw new MyException("���� �����Դϴ�.");
		} catch(MyException ex) {
			System.out.println("�����Դϴ�." + ex.getMessage());
		}
//		checkMethod(1);
		try {
			checkMethod(2);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Exception ex = new Exception("�׽�Ʈ�Դϴ�.");
//		try {
//			throw ex;
//		} catch (Exception e) {
//			System.out.println(ex.getMessage());
//		}
	}

}
