package org.kh.object1;

public class Compute01 {
		void fnc1() { 		//반환x, 매개변수x
			System.out.println("메서드 함수 1");
		}
		void fnc2(int a) { 		//반환x, 매개변수o
			System.out.println(a+"를 입력하셨습니다.");
		}
		int fnc3() { 		//반환o, 매개변수x
			return 1004;
		}
		String fnc4(int point) { 		//반환o, 매개변수o
			if(point>=90) return "합격";
			else return "불합격";
		}
}