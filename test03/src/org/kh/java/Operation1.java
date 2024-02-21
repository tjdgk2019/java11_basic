package org.kh.java;
//명령(연산)-> Operation(Opcode+Operand) : 오퍼랜드 갯수에 따라 0주소 방식~3주소 방식
//입력 항에 따라 : 단항(Unary) 이항(Binary) 삼항(ThreeFlow)

public class Operation1 {

	public static void main(String[] args) {
			boolean b1 = true;
			boolean b2 = !b1;	//단항 연산 (!는 ~을 부정한다는 의미를 갖고 있다. 그러므로, b1을 부정한다.-> 즉, b1은 true가 아니다.라는 의미-> 그러나 이미 앞에 true라고 했기때문에 결과는 false라고 나오는 것이다.)
			int i1=20;
			int i2=40;
			int i3=i1+i2;		//이항 연산
			int max = (i1>i2) ? i1 : i2;	//삼항 연산 (주기값 수치를 계산할 때 많이 사용)
					 //() 가로 안에 있는 내용이 조건문 그 조건문이 ?<-(물음표는 그 조건문이 참인지 거짓인지를 정의내리기 위해 사용한 것) i1= 20이고 i2=40 이므로 i1이 i2보다 크지 않다
					 //이때, ()가로 조건문이 사실인 경우 i1을 int max의 대입(=)하여 값으로 도출하고 거짓인 경우 i2를 대입하여 값으로 도출하면 된다. 
			
			System.out.println("b1 : "+b1);
			System.out.println("b2 : "+b2);
			System.out.println("i3 : "+i3);
			System.out.println("max : "+max);
			
	}

}
