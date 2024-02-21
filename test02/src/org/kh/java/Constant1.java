package org.kh.java;

public class Constant1 {
	public static void main(String[] args) {
		//상수 Constant와 리터럴Literal
		final int MAX_POINT = 100;
		final int MIN_POINT = 0;
		final double PI = 3.141592;
		final String MY_NAME = "이성하";
		//MY_NAME = "강기태"; <-위에 final 있기 때문에 더이상 바꿀 수 없다. 이때는 변수로 해야 한다.
		
		//위와 같이 final 지시자가 선언되고, 대문자로 표기된 것을 상수라고 하며,
		//상수는 항상 값이 같아 더 이상 변할 수 없는 값을 뜻한다.
		//변수나 상수에 대입되는 값을 리터럴이라고 한다.
		//리터럴은 2진수, 8진수, 10진수, 16진수, 정수, 상수, 실수, 문자, 문자열일수 있다.
		System.out.println("최소 점수 : "+MIN_POINT);
		System.out.println("최대 점수 : "+MAX_POINT);
		System.out.println("나의 이름 : "+MY_NAME);
		System.out.println("반지름이 10인 원의 둘레 길이 : "+(10*2*PI));
	}
}
