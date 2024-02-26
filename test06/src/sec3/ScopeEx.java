package sec3;
//특정 변수가 영향을 미치는 범위
public class ScopeEx {
		int a=10;	//전역변수: 클래스 전체에서 인지되는 변수이지만, 특정 매소드(함수)내에서는 인지 하지 못한
		static int b=100; //클래스변수: 클래스 전체에서 인지되며, 특정 매소드(함수)내에서도 인지 한다.->Global Scope
	public static void main(String[] args) {
		int a=20;	//지역변수 : 특정 메소드 내에서도 선언되어 활용되는 변수로서 함수 블록을 벗어나면, 인지할 수 없다.-> Local Scope
		run();
		run(30);
		System.out.println("지역변수 a="+a);
	}
	
	public static void run() {
		System.out.println("클래스 변수 b="+b);
	}
	
	public static void run (int a) { //매개변수: 메소드 (함수) 정의 시 괄호 안에 있는 변수로 호출 시 지정된 값을 저장한다. -> Local Scope
		System.out.println("매개변수 a="+a);
	}
}
