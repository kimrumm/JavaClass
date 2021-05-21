package com.test;

public class Sample04 {
	public static void main(String[] args) {
		int sum = 0;
		for(int jnx = 0; jnx <= 10; jnx++) {
			sum += jnx;
		}
		System.out.println(sum);	
		int inx = 0;
		int sum2 = 0;
		while(inx <= 10) {
			sum2 += inx;
			inx++;
		}
		System.out.println(sum2);
		System.out.println();		
		for(int knx = 0; knx <= 100; knx++) {
			if(knx == 55) {
				break;
			}		
			System.out.println(knx);
		}
		for(int knx2 = 0; knx2 <= 100; knx2++) {
			if(knx2 == 55) {
				continue;
			}		
			System.out.println(knx2);
		}
				
		
		
		
		
		
	}
}
