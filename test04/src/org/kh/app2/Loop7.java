package org.kh.app2;

import java.util.Random;

public class Loop7 {

	public static void main(String[] args) {
		// 1~45까지 숫자 아무거나 6개 출력
		int min=1, max=45;
		Random r =new Random();
		
		for (int i=0;i<6;i++) {
			int val= r.nextInt(max+min)+min;
			System.out.println(val+"\t");
		}
	}
}
