public class Sample07 {
	public static void main(String[] args) {
		int num = 100;
		if(num != 100) {
			System.out.println("O.K");			
		}
		String name = "홍길동";
		if(name == "이순신") {			
			System.out.println("이순신입니다.");
		} else {
			System.out.println("이순신이 아닙니다.");			
		}
//		if(name == "이순신") {
//			System.out.println("이순신입니다.");
//		}
//		if(name == "홍길동") {
//			System.out.println("홍길동입니다.");
//		}
//		if((name != "이순신") && (name != '홍길동')) {
//			
//		}
		name = "세종대왕";
		if(name == "이순신") {	
			System.out.println("이순신입니다.");
		} else if(name == "홍길동") {
			System.out.println("홍길동입니다.");
		} else {
			System.out.println("아무도 아닙니다.");
		}
	}
}




