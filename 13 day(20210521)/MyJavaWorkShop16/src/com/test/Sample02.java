package com.test;
public class Sample02 {
	public static void main(String[] args) {
		int a = 0;
		int c = a++;
		int b = a;
		System.out.println(b);
		System.out.println(c);
		
		int d = 0;
		int e = ++d + d++;
		System.out.println(e);
		
		int f = 0;
		int g = f--;
		System.out.println(g);
		System.out.println(f);
		
		int a1 = 10;
		int b1 = 20;
		if((a1 > 20) && (b1 > 10)) {
			System.out.println("a1는 20보다 크고 b1은 10보다 큽니다.");
		} else {
			System.out.println("a1는 20보다 크고 b1은 10보다 크지 않습니다.");
		}
		if((a1 > 20) || (b1 > 10)){
			System.out.println("하나라도 일치하면 처리된다.");
		}
		int c1 = (a1 == b1) ? 100 : 200;
		System.out.println(c1);
		
		int sum = 0;
		for(int inx = 0; inx < 10; inx++) {
			//sum = sum + inx;
			sum += inx;
		}
		System.out.println(sum);
	}
}






