package org.kh.java;
//대입연산 -+,-,*,/,%
public class Operation3 {
	public static void main(String[] args) {
		int a=0;
		a+=8; // a= a+8 ->8 (=은 항상 맨 마지막에 일어나는 대입이기 때문에 a에 2씩 더하라는 뜻)
		System.out.println("1. a="+a);
		a-=3; // a= a-3 ->5
		System.out.println("2. a="+a);
		a*=5; // a= a*5 ->25
		System.out.println("3. a="+a);
		a/=4; // a= a/4 ->6
		System.out.println("4. a="+a);
		a %=2; //a= a%2 ->0
		System.out.println("5. a="+a);
	}

}
