public class Sample12 {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		} catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}
	}
} 
// ������ 418 8-3
// ������ 422 8-8
// ������ 425 8-9
