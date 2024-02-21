package org.kh.java;
//형 변환(Auto Casting=묵시적 형변환, Force Casting) type conversion
public class Casting1 {
	public static void main(String[] args) {
		byte b = 20;	//1byte
		short s = b;	//2byte : byte-> short
		int i = s;		//4byte : short-> int
		long l = i;		//8byte : int-> long
		//작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소로 옮겨지면서 타입이 자동으로 변환되는 것을 Auto Casting이라고 한다.
		int i2 = (int) l;
		short s2 = (short) i;
		byte b2 = (byte) s;
		//Force Casting은 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 타입을 변환하는 하는 것이다.
	}

}
