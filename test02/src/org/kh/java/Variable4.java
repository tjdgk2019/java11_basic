package org.kh.java;

public class Variable4 {
	public static void main(String[] args) {
		String name = "이성하";
		short age = 29;
		float height = 161.8f;
		double weight = 0;
		char init = 'l'; // 문자를 저장할때는 '작은 따옴표 이때, 작은 따옴표까지 넣고 싶으면 \'(역슬래시+작은 따옴표)를 양쪽에 넣어주면 된다.
		System.out.printf("%n이름 : \" %s \"", name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f" , height);
		System.out.printf("%n체중 : %.3f", weight);
		System.out.println("\n이니셜 : "+init);
		
		/*
		 * 이스케이프 문자(\역슬래시 또는 원 표시)
		 * \n : 줄바꿈
		 * \t : 탭
		 * \\ : \를 출력
		 * \" : "를 출력
		 * \' : '를 출력
		 */
	}
}
