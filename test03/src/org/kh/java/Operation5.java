package org.kh.java;
//관계 (비교)연산자 : ==(같다), !=(같지 않다), >(크다,초과)>=(크거나 같다, 이상), <(작다, 미만), <=(작거나 같다, 이하)---->결과적으로 비교 값이 맞는지 아닌지를 정의하는 true 아니면 false으로 도출된다.
public class Operation5 {
	public static void main(String[] args) {
	int a=25;
	int b=28;
	int c=27;
	System.out.println("a와 b가 같습니까?"+(a==b));
	System.out.println("a와 b가 다릅니까?"+(a!=b));
	System.out.println("a와 b보다 큽니까?"+(a>b));
	System.out.println("a가 b보다 작습니까?"+(a<b));
	System.out.println("b가 c보다 크거나 같습니까?"+(b>=c));
	System.out.println("b가 c보다 작거나 같습니까?"+(b<=c));
	
	}

}
