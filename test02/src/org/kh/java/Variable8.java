package org.kh.java;

public class Variable8 {
	public static void main(String[] args) {
		//가변할당(동적할당-타입이 자기 마음대로 바뀐다.) : 자료형과 무관하게 해당하는 리터럴(값)에 의해 자료형이 자유롭게 현형되는 할당 방법 (버전9 이하는 x표시로 오류가 난다.)
		var num1 = 29.456;
		var num2 = 29;
		var num3 = 'l';
		var num4 = "이성하";
		var num5 = true;
		num1 = 67;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		System.out.println("num5 : "+num5);
	}

}
