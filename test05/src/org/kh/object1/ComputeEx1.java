package org.kh.object1;

public class ComputeEx1 {
	public static void main(String[] args) {
		Compute01 comp1 =new Compute01();
		comp1.fnc1();
		comp1.fnc2(1000);
		int a=comp1.fnc3();
		System.out.println(comp1.fnc3());
		System.out.println(a);
		String pass=comp1.fnc4(89);
		System.out.println(pass);
		fnc1(); //폰트가 기울임꼴로 바뀐다.
		fnc2(200);
		System.out.println(fnc3());
		System.out.println("원의 넓이: "+fnc4(25));
	}
	//어떤 특정함수에 속해있는것을 메서드, 그렇지 않고 단독으로 실행하는 것을 함수
	//함수(Function): 정의 호출
	public static void fnc1() {
		System.out.println("반환x, 매개변수x");
	}
	public static void fnc2(int a) { 		//반환x, 매개변수o
		System.out.println("입력 수: "+a);
	}
	public static int fnc3() {
		return 500;
	}
	public static double fnc4(int radius) {
		return radius*radius*3.14f;
	}
}
