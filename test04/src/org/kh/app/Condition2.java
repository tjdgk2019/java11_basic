package org.kh.app;
//조건문 if~else~: if(조건식) {조건이 참일때 실행문;} else{조건이 거짓일때 실행문;}
public class Condition2 {

	public static void main(String[] args) {
		char sel='1';
		//성별코드 (sel)가 1이거나 3이면, "남성"이고 그렇지 않으면 "여성"이다.
		String gender;
		if (sel=='1' || sel=='3') gender="남성";
		else gender="여성";
		System.out.printf("\n당신의 성별은 %s",gender);
	}
}
