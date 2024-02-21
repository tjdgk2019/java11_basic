package org.kh.java;

public class Variable2 {
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i; //선언(o),초기화(x) 그냥 출력시 Null Pointer 오류를 일이킨다.
		long l;
		i = 30; // 초기화
		l = 40; // 초기화
		
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i);	//x표시가 나온 이유는 값이 없기때문(Null Pointer)
		System.out.println("l="+l);
		//b = 130; Overflow
		//b = -130; Underflow
		
	}
}
