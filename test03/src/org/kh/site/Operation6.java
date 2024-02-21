package org.kh.site;
//논리 연산자 : &&(and), ||(or), !(not)
public class Operation6 {
	public static void main(String[] args) {
		int a= 26;
		int b=28;
		int c=27;
		//and 논리: 모든 입력이(조건이 만족,사실인 경우만) true일 경우만 출력이 true가 된다.
		System.out.println("a>b && a>c:"+(a>b&&a>c));	//false && false
		System.out.println("a>b && b>c:"+(a>b&&b>c));	//false && true
		System.out.println("a<b && b<c:"+(a<b&&b<c));	//true && false
		System.out.println("a<b && b>c:"+(a<b&&b>c));	//true && true
		
		//or 논리: 입력이 어느 하나라도 true가 있으면 출력이 true가 된다.
		System.out.println("a>b || a>c:"+(a>b||a>c));	//false || false
		System.out.println("a>b || b>c:"+(a>b||b>c));	//false || true
		System.out.println("a<b || b<c:"+(a<b||b<c));	//true || false
		System.out.println("a<b || b>c:"+(a<b||b>c));	//true || true
		
		//not 논리: 입력이 true이면 출력은 false, 입력이 false이면 출력은 true (입력과 출력이 서로 반대로 된다.)<-not단항연산
		System.out.println("!(a>b:)"+!(a>b));
		System.out.println("!(a<b:)"+!(a<b));
		
	}
}
