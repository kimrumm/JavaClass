package com.test;

import java.util.*;

public class Sample04 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		for(Integer i : al) {
			System.out.println(i);
		}
		List<Integer> al2 = new ArrayList<Integer>();
		List<Integer> al3 = new LinkedList<Integer>();
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "�̼���");
		mp.put(2, "������Ȳ");
		mp.put(3, "ȫ�浿");
		for(Integer k : mp.keySet()) {
			System.out.println(k + ", " + mp.get(k));
			
		}
		Set<Integer> set = mp.keySet();
		Set<Map.Entry<Integer, String>> set2 = mp.entrySet();
		Iterator ltr = set2.iterator();
		while(ltr.hasNext()) {
			Map.Entry<Integer, String> e 
			= (Map.Entry<Integer, String>)ltr.next();
			System.out.println(e.getKey() + ", " + e.getValue());
		}
		
	}
}








